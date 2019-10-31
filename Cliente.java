import java.util.ArrayList;
import java.util.List;
public class Cliente {
//dados do cliente
    int idCliente;
    String nomeCliente;
    String dtNasc;
    String cpf;
    int diasDev;
    int qddFilme;
    //cliente tem locacoes
    List<Locacao> locacao = new ArrayList<>();
    //construtor
    Cliente(int idCliente, String nomeCliente, String dtNasc, String cpf, int diasDevol){
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.qddFilme = 0;
    }
    //função que retorna os dados pro programa principal
    void dadosCliente(){
        System.out.println("\nCadastro:             "+ this.idCliente);
        System.out.println("Nome:                 "+ this.nomeCliente);
        System.out.println("CPF:                  "+ this.cpf);
        System.out.println("Devolução:            "+ this.diasDev);
        System.out.println("Quantidade de filmes: "+ this.qddFilme);
    }
}
       
