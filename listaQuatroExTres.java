import java.util.Scanner;
import java.lang.Double;

//fup que leia 10 valores double e salve em um array, depois imprima esses valores

public class listaQuatroExTres {
    public static void main(String[] args){
        final int tamanho = 10;
        Scanner scanner = new Scanner(System.in);
        
        double valor[] = new double[tamanho];

        System.out.println("Digite os valores para o array: \n");
        
        for(int i=0; i< tamanho; i++){
            Double aux = scanner.nextDouble();
            if((aux>=0) && (aux<=10)){
                valor[i] = aux;
            }
            else{
                System.out.println("Nota invalida, favor digitar novamente: ");
                i--;
            }
        }
        scanner.close();
        System.out.println("Os valores digitados são: \n");
        for (double value : valor) {
            
            System.out.println(value);
        
        }
    }
}