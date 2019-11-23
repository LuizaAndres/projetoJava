import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
    public static Connection getConnection() throws Exception{
        try{
            final String url = "jdbc:mysql://Localhost:3306/jacks";
            final String user ="root";
            final String password = "";
            return DriverManager.getConnection(url, user, password);
        }   catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}