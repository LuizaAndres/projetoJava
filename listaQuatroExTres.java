import java.util.Scanner;

//fup que leia 10 valores double e salve em um array, depois imprima esses valores

public class listaQuatroExTres {
    public static void main(String[] args){
        final int tamanho = 10;
        Scanner scanner = new Scanner(System.in);
        
        double valor[] = new double[tamanho];

        System.out.println("Digite os valores para o array");

        for(int i=0; i< tamanho; i++){
            valor[i] = scanner.nextDouble();
        }
        scanner.close();
        for (double value : valor) {
            System.out.println(value);
        }
    }
}