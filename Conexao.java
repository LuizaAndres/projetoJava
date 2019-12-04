import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/contas?useTimezone=true&serverTimezone=UTC","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }

    }
}