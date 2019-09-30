//FUP receba a temperatura media de cada mes do ano e apos exiba a temperatura media do ano
import java.util.Scanner;
public class listaQuatroExOito {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int tamanho = 12;
        int temp[] = new int[tamanho];        
        int soma=0;
        int media=0;
        //recebe as temperaturas com um for i=12
        for(int i=0; i< tamanho; i++){
            System.out.println("Digite a temperatura do "+ (i+1) +"° mes:");
            temp[i] = scanner.nextInt();
            //faz a função soma com um auxiliar dentro do for
            soma = soma + temp[i];
            //faz a media a cada mes dentro do for
            media = soma/(i+1);
            if(i<12){
                System.out.println("A média parcial é: "+ media);
            }
        }
        scanner.close();
        //imprime media final depois do for
        System.out.println("A média final é: "+ media);
        

    }
}