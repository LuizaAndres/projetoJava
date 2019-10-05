
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class outro{
    public static void main(String[] args) {
    try{
        //Criando o buffer para ler o arquivo dos dados
        BufferedReader leitura = new BufferedReader(new FileReader("lista.txt"));
        //Criando o buffer para salvar os valores (e o arquivo)
        BufferedWriter escrita = new BufferedWriter(new FileWriter("listasaida.txt"));
        
        //Salva os valores do arquivo dentro da variavel array quebrando por ,
        String[] array = leitura.readLine().split(",");

        //Encerrando a variavel criada para ler o arquivo   
        leitura.close();

        //Passando os valores do array para tipo int
            //Criando um array para receber esses valores
            int[] listaValores = new int[array.length];
            //Convertendo string em int e salvando dentro do novo array
            for(int i=0; i<array.length; i++){
                listaValores[i] = Integer.parseInt(array[i]);
            }
        // Fim passagem para int

        //insertsort
            //Começa na casa 1 do array, pq ele vai da direita pra esquerda
            for (int i = 1; i < listaValores.length; i++){

                //Salvando o valor atual em uma auxiliar - aux
                int aux = listaValores[i];

                //Salvando o valor do loop atual em outra auxiliar - J
                int j = i;

                //enquanto a auxiliar J for maior que 0 e o valor da lista na posição anterior a atual for maior
                while ((j > 0) && (listaValores[j-1] > aux)){
                    //pegue o valor anterior ao atual e coloque na casa atual (troque)
                    listaValores[j] = listaValores[j-1];
                    //System.out.println(Arrays.toString(listaValores));
                    //Retira 1 da posição atual para recolocar o valor anteriormente salvo na posição trocada
                    j -= 1;
                }
                //Colocando o valor inicialmente salvo na variavel auxiliar - aux - dentro da posição anterior valor
                listaValores[j] = aux;
                //Mostrando como esta ficando o array
                System.out.println(Arrays.toString(listaValores));
                
            }
        //fim insertsort
        
        //Criando uma collection
        ArrayList<Integer> list = new ArrayList<>();

        //Jogando todos os valores do array ja ordenado dentro da collection tipo Lista
        for (int i = 0; i < listaValores.length; i++){
            list.add(listaValores[i]);
        }

        //Mostrando as informações
            //Mostrando o array ordenado
            for (int i = 0; i < listaValores.length; i++){
                System.out.println(listaValores[i]);
            }

            //Dando um enter para separar ambas as listas
            System.out.println("\n");

            //Mostrando a Collection ordenada
            for(int valor:list){
                System.out.println(valor);
            }
        //Fim mostrando as informações
        for(int valor:list){
            escrita.append(" "+valor);
        }

        //Encerrando a variavel de escrita
        escrita.close();  
    } catch (IOException exception){
        System.out.println("Erro de exceção I/O: " + exception.getMessage());
    }
    }
}