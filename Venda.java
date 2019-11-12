import java.util.Date;

public class Venda {
    int id;
    Date dtVenda;
    Funcionario funcionario;
    Cliente cliente;
    
    Venda(int id, Date dtVenda, Funcionario funcionario, Cliente cliente){
        this.id=id;
        this.dtVenda= new Date();

    }
}