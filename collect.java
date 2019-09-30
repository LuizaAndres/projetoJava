import java.util.ArrayDeque;
import java.util.Scanner;
public class listaQuatroExNove {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numero = new ArrayList<>();
        int pilha,qtde;
        try{
            System.out.println("Quatnas inf. quer colocar");
            qtde = scanner.nextInt();
            for(int i =0; i<qtde; i++){
                pilha = scanner.nextInt();
                stack.add(pilha); 
            }   
        }catch(Exception e){
            System.out.println("Erro deu aqui: "+e);
        }
        
    }
}