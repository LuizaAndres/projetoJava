import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Loja{
    public static void main(String[] args){
        //criando funcionarios
        Map<Integer,Funcionario> funcionarios = new HashMap<>();
        Funcionario funcionario = new Funcionario(funcionarios.size()+1, "Admin","admin" , "admin", 0.0, "admin");
        funcionarios.put(funcionarios.size()+1, funcionario);
        Funcionario getFuncionario = funcionarios.get(0);
        
        
        String FuncTeste = "Admin";
        String pswFuncTeste = "admin";
        getFuncionario.autenticar(FuncTeste, pswFuncTeste);

        //criando clientes
        Map<Integer,Cliente> clientes = new HashMap<>();
        Cliente cliente = new Cliente(clientes.size()+1, "Cli1", "Cli1", "Cli1", "endereco", "tel");
        clientes.put(clientes.size()+1, cliente);
        Cliente getClientes = clientes.get(0);
        String cliTeste = "Cli1";
        String pswCliTeste = "Cli1";

        getClientes.autenticar(cliTeste, pswCliTeste);



        
        
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