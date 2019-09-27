//FUP que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou impares.
import java.util.Scanner;
public class listaQuatroExQuatro {
    public static void main(String[] args){

//ler vetor
        final int tamanho = 10;
        Scanner scanner = new Scanner(System.in);
                
        int valor[] = new int[tamanho];

        System.out.println("Digite os valores para o array: \n");

        for(int i=0; i< tamanho; i++){
            valor[i] = scanner.nextInt();
        }
        scanner.close();
//ver se é par ou impar
        for(int i=0; i< tamanho; i++){
            if (valor[i]%2==0){
                System.out.println(valor[i] + " esse numero é par");
            }
            else{
                System.out.println(valor[i] + " esse numero é impar");
            }
        }
    }
}