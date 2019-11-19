import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Funcionario extends Usuario{
    private int id;
    private double salario;
    private String banco;
    private Date dtNasc;
    List<Venda> vendas = new ArrayList<>();
    Map<Integer,Funcionario> funcionarios = new HashMap<>();

    Funcionario(int idU, String userName, String psw, String nome, int id, double salario, String banco){
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
    String banco(){
        return this.banco;
    }
    double salario(){
        return this.salario;
    }
    int idFunc(){
        return this.id;
    }
    Date dtnasc(){
        return this.dtNasc;
    }
}