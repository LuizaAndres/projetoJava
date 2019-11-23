import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Index {

    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/jacks?useTimezone=true&serverTimezone=UTC";//parametro pra conexao do banco pq xampp e pc estao com horarios diferentes
        String user ="root";
        String password="";

        Connection connection = DriverManager.getConnection(url, user,password);
        
        DAO dao = new DAO();
        String insertUser = "INSERT INTO usuario " + 
                            "(user_name, password, name) " + 
                            "VALUES(?,?,?)";
        Object[] obj = {"usuario3", "456789", "Teste" };
        System.out.println(dao.insert(insertUser, obj));

        System.out.println("Exibindo usuarios: ");
        Conexao.findUser(connection);
        connection.close();
    }
}