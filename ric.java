//fup que questione a quantidade de nota a ser informada, receba as notas e calcule a média.

import java.util.Scanner;
//
public class ric{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        //quantas notas o usuário quer
        System.out.println("Quantas notas voce quer informar?");
        double quantidade = scanner.nextDouble();

        //rebeber as notas do usuário
        double nota[quantidade];
        for(int i=0; i<quantidade; i++){
            System.out.println("Qual a "+ (i+1) +"° nota?");
            double nota[i] = scanner.nextDouble();
        }
        //calcular a media

        //impriir a media
        
        
        scanner.close();


    }
}