import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Funcionario extends Usuario{
    private int id;
    private double salario;
    private String banco;
    private Date dtNasc;
    List<Venda> vendas = new ArrayList<>();

    Funcionario(int idU, String userName, String psw, String nome, double salario, String banco){
        super(idU, userName, psw, nome);
        this.salario=salario;
        this.banco=banco;
    }
    String nome(){
        return super.nome();
    }
    //String tempoContrato(){
    //}
    int qtdVendas(){
        return this.vendas.size();


    }
}