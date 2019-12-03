import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.PreparableStatement;

import Conexao;

public class DAO {
    private Connection connection;
    int idPessoa;
    String nomePessoa;
    String emailPessoa;
    double percDesconto;
    double imposto;
    int idConta;
    int mes;
    int ano;
    double valor;

    public DAO() {
        this.connection = new Connection().getConnection();
    }

    public void adicionaPessoa(Pessoas pessoas) {
        String sql = "INSERT INTO pessoas (idPessoa,nomePessoa,EmailPessoa) VALUES (?,?,?)";
        try {
            PreparableStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pessoas.getId());
            stmt.setString(2, pessoas.getNome());
            stmt.setString(3, pessoas.getEmail());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        String sql1 = "INSERT INTO proventos (idPessoa,imposto,valor,mes,ano) VALUES (?,?,?,?,?)";
        try {
            PreparableStatement stmt = connection.prepareStatement(sql1);
            stmt.setInt(proventos.getId());
            stmt.setDouble(proventos.getImposto());
            stmt.setDouble(proventos.getValor());
            stmt.setInt(proventos.getMes());
            stmt.setInt(proventos.getAno());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        String sql2 = "INSERT INTO dividas (idPessoa,desconto,valor,mes,ano) VALUES (?,?,?,?,?)";
        try {
            PreparableStatement stmt = connection.prepareStatement(sql2);
            stmt.setInt(dividas.getIdPessoa());
            stmt.setDouble(dividas.getDesconto());
            stmt.setDouble(dividas.getValor());
            stmt.setInt(dividas.getMes());
            stmt.setInt(dividas.getAno());
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}