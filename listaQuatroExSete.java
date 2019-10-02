//FUP simule a fila de atendimento no banco

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class listaQuatroExSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> normal = new LinkedList<>();
        Queue<String> preferencial = new LinkedList<>();
        int auxn = 0;
        int auxp = 0;
        int op = 1;

        do {
            System.out.println("Escolha uma opção:\n" + 
                                "1 - Retirar Senha Normal\n" + 
                                "2 - Retirar Senha Preferencial\n" + 
                                "3 - Chamar Proximo\n" +
                                "9 - Encerra o programa.");
            op = scanner.nextInt();

            switch (op) {
            case 1:
                System.out.println("Normal");
                normal.add("N" + auxn);
                auxn++;
                break;
            case 2:
                System.out.println("Preferencial");
                preferencial.add("P" + auxp);
                auxp++;
                break;
            case 3:
                System.out.println("Imprime Senha");
                if (preferencial.size() > 0) {
                    System.out.println(preferencial.poll());
                } else if (normal.size() > 0) {
                    System.out.println(normal.poll());
                } else {
                    System.out.println("Não há fila de espera");
                }
                break;

            default:
                System.out.println("Não é função válida!");
            }
        } while (op != 9);

        scanner.close();
    }
}