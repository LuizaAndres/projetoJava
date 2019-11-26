import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    int id;
    Date dtVenda;
    Funcionario funcionario;
    Cliente cliente;
    List<VendaProduto> vendaProdutos = new ArrayList<>();
    
    Venda(int id, Funcionario funcionario, Cliente cliente){
        this.id = id;
        this.dtVenda= new Date();
        this.funcionario = funcionario;
        this.cliente = cliente;
        funcionario.vendas.add(this);
        cliente.vendas.add(this);
    }

    public void adicionarProduto(Produto produto, int quantidade){
        this.vendaProdutos.add(new VendaProduto(this, produto, quantidade));
    }
}