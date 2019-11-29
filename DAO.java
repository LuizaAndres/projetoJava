import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private static Connection connection;

    public static int insert(String sql, Object[] atribs) throws Exception {
        try{
            PreparedStatement statement = startConnection().prepareStatement(
                sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Atribui os valores
            insertAtribs(statement, atribs);

            // Verifica se o retorno é um valor criado
            if(statement.executeUpdate() > 0){
                ResultSet resultado = statement.getGeneratedKeys();

                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }
            return -1;
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private static void insertAtribs(PreparedStatement statement, Object[] atribs) throws SQLException {
        int idx = 1;
        for(Object atrib: atribs){
            if(atrib instanceof String) {
                statement.setString(idx, (String) atrib);
            } else if (atrib instanceof Integer){
                statement.setInt(idx, (Integer) atrib);
            }
            idx++;
        }
    }
    private static Connection startConnection() throws Exception {
        if(connection != null && !connection.isClosed()){
            return connection;
        }

        connection = Conexao.getConnection();

        return connection;
    }

    public static void endConnection() throws SQLException, Exception {
        startConnection().close();
    }
}