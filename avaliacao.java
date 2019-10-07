import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
public class avaliacao {
    public static void main(String[] args){
        System.out.println("Luiza Andres");
        //recebe lista de valores de um arquivo de texto
        int i;
        try{
            BufferedReader ler = new BufferedReader(new FileReader("lista.txt"));
            //definindo arquivo de saida
            BufferedWriter escrita = new BufferedWriter(new FileWriter("listasaida.txt"));
            //alocando os valores no Array
            String[] array = ler.readLine().split(",");
            int[] valor = new int[array.length];
            //Convertendo string em int e salvando dentro do novo array
            for(i=0; i<array.length; i++){
                valor[i] = Integer.parseInt(array[i]);
            }
            ler.close();
            //ordenando o array
            int aux = 0;
            System.out.println("Organizando o Array");
            for(i = 0; i<valor.length; i++){
                //seleciona o primeiro numero do arquivo
                for(int j = 0; j<(valor.length-1); j++){
                    if(valor[j] > valor[j + 1]){
                        //verifica se o primeiro numero é maior que o segundo
                        aux = valor[j];
                        //salva o maior (primeiro) na aux
                        valor[j] = valor[j+1];
                        // o primeiro recebe o valor do segundo
                        valor[j+1] = aux;
                        //o segundo recebe o valor do primeiro
                    }
            // imprimindo em tela os passos ocorridos desta ordenação.  
                }
                System.out.println(Arrays.toString(valor));
            }
            // Colocando valores ordenados na Collection
            ArrayList<Integer> list = new ArrayList<>();
            for(i = 0; i<valor.length; i++){
                list.add(valor[i]);
            }
            // imprimindo valor ordenado do Array
            System.out.println("Vetor organizado:");
            System.out.println(Arrays.toString(valor));
            // imprimindo valor da Collection garantindo que estejam iguais,
            System.out.println("Collection organizada");
            for (i=0; i<valor.length; i++){
                System.out.print(valor[i] + ", ");
                // gravando em txt
                escrita.append(", "+valor[i]);
            }
            escrita.close();
        }catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }
    }
}