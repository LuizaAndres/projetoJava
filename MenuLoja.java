import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

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
        
        imprimirLista(clientes);

        int op;
        int opCad;
        int opCon;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n");
        System.out.println("1 - Cadastrar \n");
        System.out.println("2 - Consultar \n");
        System.out.println("3 - Sair \n");
        op = scanner.nextInt();
        do{ 
            switch(op){
                //cadastro geral
                case 1:
                opCad = scanner.nextInt();
                do{ 
                    System.out.println("Cadastrar:\n");
                    System.out.println("Escolha uma opção: \n");
                    System.out.println("1 - Cliente \n");
                    System.out.println("2 - Funcionario \n");
                    System.out.println("3 - Venda \n");
                    System.out.println("4 - Voltar \n");
                    switch(opCad){
                        //cadastrar cliente
                        case 1:
                        System.out.println("Cliente \n");
                        break;
                        //cadastrar funcionario
                        case 2:
                        System.out.println("Funcionario");
                        break;
                        //cadastrar venda
                        case 3:
                        System.out.println("Venda");
                        break;
                        //voltar
                        case 4:
                        System.out.println("Voltar");
                        break;          
                        default:
                        System.out.println("Opção inválida\n");
                        break;
                    } 
                }while (op!=4);
                //consultar                    
                case 2:
                do{ 
                    System.out.println("Consultar:\n");
                    System.out.println("Escolha uma opção: \n");
                    System.out.println("1 - Lista de Clientes \n");
                    System.out.println("2 - Lista de Funcionario \n");
                    System.out.println("3 - Compras por cliente \n");
                    System.out.println("4 - Venda por Funcionario \n");
                    System.out.println("5 - Voltar \n");
                    opCon = scanner.nextInt();
                    switch(opCon){
                        //cadastrar cliente
                        case 1:
                        System.out.println("Lista de Clientes \n");
                        break;
                        //cadastrar funcionario
                        case 2:
                        System.out.println("Lista de Funcionario");
                        break;
                        //cadastrar venda
                        case 3:
                        System.out.println("Compras por cliente");
                        break;
                        //voltar
                        case 4:
                        System.out.println("Venda por Funcionario");
                        break;
                        case 5:
                        System.out.println("Voltar");
                        break; 
                        default:
                        System.out.println("Opção inválida\n");
                        break;
                    }  
                } while (op!=5);
                default:
                System.out.println("Opção inválida\n");
            } 
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
            
            
            
        } while (op!=3);
        scanner.close();
    }

    static void imprimirLista(Map<Integer, Cliente> mapping){
        for(Entry<Integer,Cliente> map:mapping.entrySet()){
            System.out.println("Id: " + map.getKey() + " - Nome: " + map.getValue().nome());
        }
    }
}