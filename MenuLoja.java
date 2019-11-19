import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

class Loja{
    public static void main(String[] args){
//criando mapa usuários
        Map<Integer,Usuario> usuarios = new HashMap<>();
 //criando mapa funcionarios
        Map<Integer,Funcionario> funcionarios = new HashMap<>();  
        
//criando mapa clientes
        Map<Integer,Cliente> clientes = new HashMap<>();
        /*Cliente cliente = new Cliente(usuarios.size()+1, userName, psw, nome, clientes.size()+1, endereco, tel);
        usuarios.put(usuarios.size()+1, cliente);
        clientes.put(clientes.size()+1, cliente);*/

//criando mapa de produtos        
        Map<Integer,Produto> produtos = new HashMap<>();
        Produto produto= new Produto(produtos.size()+1, "agua", 2.00);
        produtos.put(produtos.size()+1, produto);
//criando mapa de vendas
        Map<Integer,Venda> vendas = new HashMap<>();
        /*Venda venda = new Venda(vendas.size(), funcionarios.get(codigoFuncionario), clientes.get(codigoCliente));
        venda.adicionarProduto(produtos.get(codigoProduto), quantidade);*/


//_______________________________________________________________________________        
        int op;
        int opCad;
        int opCon;


//primeiro menu  


        Scanner scanner = new Scanner(System.in);
        do{ 
            System.out.println("Escolha uma opção: \n");
            System.out.println("1 - Cadastrar \n");
            System.out.println("2 - Consultar \n");
            System.out.println("3 - Sair \n");
            op = scanner.nextInt();
            switch(op){
//cadastro geral
                case 1:
//primeiro menu                
                do{
                    System.out.println("Cadastrar - Escolha uma opção: \n");
                    System.out.println("1 - Cliente \n");
                    System.out.println("2 - Funcionario \n");
                    System.out.println("3 - Venda \n");
                    System.out.println("4 - Voltar \n");
                    opCad = scanner.nextInt();
                    switch(opCad){
    //cadastrar cliente
                        case 1:
                        System.out.println("Cliente \n");
                        //cadastraCliente(clientes);
                        System.out.println("Digite nome de usuário: ");
                        String userName = scanner.next();
                        System.out.println("Digite novo password: ");
                        String psw = scanner.next();
                        System.out.println("Digite nome: ");
                        String nome = scanner.next();
                        System.out.println("Digite endereco: ");
                        String endereco = scanner.next();
                        System.out.println("Digite telefone: ");
                        String tel = scanner.next();
    //colocando o cliente no map usuário e clientes
                        Cliente cliente = new Cliente(usuarios.size()+1, userName, psw, nome, clientes.size()+1, endereco, tel);
                        usuarios.put(usuarios.size()+1, cliente);
                        clientes.put(clientes.size()+1, cliente);
                        break;
    //cadastrar funcionario
                        case 2:
                        System.out.println("Funcionario");
                        System.out.println("Digite nome de usuário: ");
                        userName = scanner.next();
                        System.out.println("Digite novo password");
                        psw = scanner.next();
                        System.out.println("Digite nome: ");
                        nome = scanner.next();
                        System.out.println("Digite salario: ");
                        double salario = scanner.nextDouble();
                        System.out.println("Digite numero do banco: ");
                        String banco = scanner.next();
    //colocando o funcionarios no map usuários e funcionarios                        
                        Funcionario funcionario = new Funcionario(usuarios.size()+1, userName, psw, nome, funcionarios.size()+1, salario, banco);
                        
                        funcionarios.put(funcionarios.size()+1, funcionario);
                        usuarios.put(usuarios.size()+1, funcionario);

                        break;
    //cadastrar venda
                        case 3:
                        System.out.println("Venda");
                        System.out.println("Informe o código do funcionario\n");
                        int codigoFuncionario = scanner.nextInt();
                        System.out.println("Informe o código do cliente\n");
                        int codigoCliente = scanner.nextInt();
                        Venda venda = new Venda(vendas.size(), funcionarios.get(codigoFuncionario), clientes.get(codigoCliente));
                        do {
                            System.out.println("Digite o códio do Produto:");
                            int codigoProduto = scanner.nextInt();
                            System.out.println("Digite a quantidade do Produto:");
                            int quantidade = scanner.nextInt();

                            venda.adicionarProduto(produtos.get(codigoProduto), quantidade);
                            System.out.println("Deseja inserir um novo produto?");
                        } while(scanner.next().equalsIgnoreCase("sim"));
                        break;
    //voltar
                        case 4:
                        System.out.println("Voltar");
                        break;          
                        default:
                        System.out.println("Opção inválida\n");
                        break;
                    } 
                }while (opCad!=4);
                break;
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
    //lista de clientes
                        case 1:
                        System.out.println("Lista de Clientes \n");
                        imprimirLista(clientes);
                        break;
    //lista de funcionarios
                        case 2:
                        System.out.println("Lista de Funcionario \n");
                        imprimirListaFunc(funcionarios);
                        break;
    //compras por cliente
                        case 3:
                        System.out.println("Compras por cliente \n");

                        break;
    //venda por funcionario
                        case 4:
                        System.out.println("Venda por Funcionario \n");
                        break;
    //voltar
                        case 5:
                        System.out.println("Voltar");
                        break; 
                        default:
                        System.out.println("Opção inválida\n");
                        break;
                    }  
                } while (opCon!=5);
                break;
                case 3:
                    System.out.println("Até mais pessoal!");
                    break;
                default:
                    System.out.println("Opção inválida\n");
            } 
    //fim do segundo menu            
            //validadr acesso username password
            //String passw = nextLine
            //autenticar(passw); 
            
            
            
        } while (op!=3);
        scanner.close();
    //fim do primeiro menu
    }

//metodo de imprimir lista dos clientes
    static void cadastraCliente(Map<Integer,Cliente> clientes){
        int idCliente = clientes.size();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nome de usuário: ");
        String userName = scanner.next();
        System.out.println("Digite novo password: ");
        String psw = scanner.next();
        System.out.println("Digite nome: ");
        String nome = scanner.next();
        System.out.println("Digite endereco: ");
        String endereco = scanner.next();
        System.out.println("Digite telefone: ");
        String tel = scanner.next();

        Cliente cliente = new Cliente(idCliente, userName, psw, nome, idCliente, endereco, tel);
        clientes.put(idCliente, cliente);
        scanner.close();
    }
    static void imprimirLista(Map<Integer, Cliente> mapping){
        for(Entry<Integer,Cliente> map:mapping.entrySet()){
            System.out.println("Id: " + map.getKey() + " - Nome: " + map.getValue().nome());
        }
    }
//metodo de imprimir lista dos funcionarios
    static void imprimirListaFunc(Map<Integer, Funcionario> mapping){
        for(Entry<Integer,Funcionario> map:mapping.entrySet()){
            System.out.println("Id: " + map.getKey() + " - Nome: " + map.getValue().nome());
        }
    }

}