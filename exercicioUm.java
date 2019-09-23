//fup que questione a quantidade de nota a ser informada, receba as notas e calcule a média.

import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args){
        System.out.println("Informa a quantidade de notas");
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.println("informe o "+ (i + 1) +" número");
            notas[i] = scanner.nextDouble();
        }

        
        
        scanner.close();


    }
}