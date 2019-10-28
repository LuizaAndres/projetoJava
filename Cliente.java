public class Cliente {
//dados do cliente
    int id_Cliente;
    String nome_Cliente;
    String dt_Nasc;
    String cpf;
    int dias_Devol;
    int qdd_filme;
    //construtor
    Cliente(int id_Cliente, String nome_Cliente, String dt_Nasc, String cpf, int dias_Devol){
        this.id_Cliente = id_Cliente;
        this.nome_Cliente = nome_Cliente;
        this.dt_Nasc = dt_Nasc;
        this.cpf = cpf;
        this.dias_Devol = dias_Devol;
        this.qdd_filme = 0;
    }
    //função que retorna os dados pro programa principal
    void dadosCLiente(){
        System.out.println("Cadastro:              "+ this.id_Cliente);
        System.out.println("\nNome:                "+ this.nome_Cliente);
        System.out.println("\nCPF:                 "+ this.cpf);
        System.out.println("\nDevolução:           "+ this.dias_Devol);
        System.out.println("\nQuatidade de filmes: "+ this.qdd_filme);
    }
}
       
