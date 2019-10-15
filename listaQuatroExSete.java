//FUP simule a fila de atendimento no banco

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class listaQuatroExSete {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Queue<String> normal = new LinkedList<>();
        Queue<String> preferencial = new LinkedList<>();
        int auxn=0;
        int auxp=0;
        int op = 1;
        do{    
            System.out.println("Escolha uma opção:\n1 - Senha normal\n2 - Preferencial\n3 - chamar proximo");
            op= scanner.nextInt(); 
            switch (op) {
                case 1:
                System.out.println("Normal");
                normal.add("N"+auxn);
                auxn++;
                break;
                case 2:
                System.out.println("Preferencial");
                preferencial.add("P"+auxp);
                auxp++;
                break;
                case 3:
                System.out.println("imprime senha");
                if(preferencial.size()>0){
                    System.out.println(preferencial.poll());
                }else{
                    System.out.println(normal.poll());
                }
                break;
                default:
                System.out.println("Não é função1 válida!");
            }
        } while (op!=9);   
        scanner.close();
    }
}