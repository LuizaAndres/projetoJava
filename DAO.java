import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class DAO {
    private Connection connection;
//insere coisas no BD
    public int insert(String sql, Object[] atribs) throws Exception {
        try{
            PreparedStatement statement = this.startConnection().prepareStatement(
                sql, PreparedStatement.RETURN_GENERATED_KEYS);
        // Atribui os valores
            insertAtribs(statement, atribs);
        // Verifica se o retorno é um valor criado no AI
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

    private void insertAtribs(PreparedStatement statement, Object[] atribs) throws SQLException {
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
//select de pessoas
//Cria um mapa que vai armazenar os obj de pessoas
    public Map<Integer,Pessoas> getPessoas(DAO dao, Map<Integer,Pessoas>pessoas) throws SQLException{
//faz o select do SQL        
        String sql = "SELECT * FROM pessoas";
        try {
//tenta conectar
            Statement statemente = dao.startConnection().createStatement();
//cria um set de resultados e executa a querry
            ResultSet resultados = statemente.executeQuery(sql);
    // enquanto tiver instancias
            while(resultados.next()){
        //e armazena no user que é do tipo pessoa        
                Pessoas user = new Pessoas(
                    resultados.getInt("id"),
                    resultados.getString("nome"),
                    resultados.getString("email")
                );
        //e leva pra tela o int e as insfos armazenadas no user        
                pessoas.put(resultados.getInt("id"),user);
            }
        } catch (Exception e) {
//TODO: handle exception
        }
        return pessoas;
    }
//select de dividas, proventos
//cria o mapa de pessoas que contem mapa de dividas e mapa de proventos
public Map<Integer,Pessoas> getDividas(DAO dao, Map<Integer,Pessoas>pessoas) throws SQLException {
//usa a funcao de select de cima pra pegar as pessoas da tabela pessoas    
    pessoas = getPessoas(dao, pessoas);
//armazena as pessoas no foreach abaixo    
    for(Pessoas pessoa:pessoas.values()){
//função aql que seleciona dividas
        String sql = "SELECT * FROM dividas WHERE pessoas_id="+pessoa.getId();
//função sql que seleciona proventos
        String sql2 = "SELECT * FROM proventos WHERE pessoas_id="+pessoa.getId();
        try {
            Statement statemente = dao.startConnection().createStatement();
//executa a qquerry das dividas
            ResultSet resultados = statemente.executeQuery(sql);
            }
        catch (Exception e){
        }
        try {
            Statement statemente2 = dao.startConnection().createStatement();
    //executa a querry de proventos
            ResultSet resultados2 = statemente2.executeQuery(sql2);

        } catch (Exception e) {
            //TODO: handle exception
        }

    }
    return pessoas;
}
//comeca conexao
    public Connection startConnection() throws Exception {
        if(this.connection != null && !connection.isClosed()){
            return this.connection;
        }

        this.connection = Conexao.getConnection();

        return this.connection;
    }
//finaliza conexao
    public void endConnection() throws SQLException, Exception {
        startConnection().close();
    }
}