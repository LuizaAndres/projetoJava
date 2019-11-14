import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Loja{
    public static void main(String[] args){
        //criando usuários
        Map<Integer,Usuario> usuarios = new HashMap<>();
        
        //criando funcionarios
        Map<Integer,Funcionario> funcionarios = new HashMap<>();
        Funcionario funcionario = new Funcionario(usuarios.size()+1, "FuncUNAdmin","Funcpsw", "FuncNome",funcionarios.size()+1 , 0.0, "admin");
        funcionarios.put(funcionarios.size()+1, funcionario);
        Funcionario getFuncionario = funcionarios.get(1);
        
        
        String FuncTeste = "FuncUNAdmin";
        String pswFuncTeste = "Funcpsw";
        getFuncionario.autenticar(FuncTeste, pswFuncTeste);
        System.out.println("foi o func");

        //criando clientes
        Map<Integer,Cliente> clientes = new HashMap<>();
        Cliente cliente = new Cliente(usuarios.size()+1, "CliUserName1", "CliPsw1", "CliNome1",clientes.size()+1, "CliEndereco", "CliTel");
        clientes.put(clientes.size()+1, cliente);
        Cliente getClientes = clientes.get(1);
        String cliTeste = "Cli1";
        String pswCliTeste = "Cli1";

        getClientes.autenticar(cliTeste, pswCliTeste);

        System.out.println("Foi o cli");

        Map<Integer,Produto> produtos = new HashMap<>();
        Produto produto= new Produto(produtos.size()+1, "agua", 2.00);
        produtos.put(produtos.size()+1, produto);
        

        
        
           /*menu
        switch(entrada){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;*/
            //cadastrar
                //cadartrar cliente
                //cadastrar funcionario
                // cadastrar venda *quer cadastar novo produto?
            //exibir
                //lista de funcionarios
                //lista de clientes
                //lista de compras do cliente selecionado
                //lista de vendas do funcionario selecionado
                //validadr acesso username password
                //String passw = nextLine
                //autenticar(passw); 

        
    
    }
}