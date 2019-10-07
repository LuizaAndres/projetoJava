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
            BufferedWriter escrita = new BufferedWriter(new FileWriter("listasaida.txt"));
            // Após, deverá ser alocado os valores dentro da estrutura de Array (não poderão ser aplicadas Collections para solução),
            String[] array = ler.readLine().split(",");
            int[] valor = new int[array.length];
            //Convertendo string em int e salvando dentro do novo array
            for(i=0; i<array.length; i++){
                valor[i] = Integer.parseInt(array[i]);
            }
            ler.close();
            //ordenando a bagaça
            int aux = 0;
            for(i = 0; i<valor.length; i++){
                //seleciona o primeiro numero inserido
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
            // Após, deverá ser utilizado uma Collection para o recebimento dos mesmos valores, de maneira que estes valores já estejam ordenados.
            ArrayList<Integer> list = new ArrayList<>();
            for(i = 0; i<valor.length; i++){
                list.add(valor[i]);
            }
            // Ao final, deverá ser impresso em tela o valor ordenado do Array e da Collection, garantindo que estejam iguais,
            System.out.println("Vetor organizado:");
            System.out.println(Arrays.toString(valor));
            System.out.println("Meu array organizado");
            for (i=0; i<valor.length; i++){
                System.out.print(valor[i] + "; ");
                // e deverá ser exportado em um arquivo de texto esses valores.
                escrita.append(", "+valor[i]);
            }
            escrita.close();
        }catch (IOException exception){
            System.out.println("Erro de exceção I/O: " + exception.getMessage());
        }
    }
}