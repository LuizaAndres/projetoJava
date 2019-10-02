import java.util.ArrayList;
//Fup que possua uma collection que contenha as 52 cartas do baralho e imprima elas.
public class listaQuatroExCinco {
    public static void main(String[] args){
        ArrayList<String> numero = new ArrayList<>();
        numero.add("A");
        numero.add("2");
        numero.add("3");
        numero.add("4");
        numero.add("5");
        numero.add("6");
        numero.add("7");
        numero.add("8");
        numero.add("9");
        numero.add("10");
        numero.add("J");
        numero.add("Q");
        numero.add("K");
        ArrayList<String> nipe = new ArrayList<>();
        nipe.add("Copas");
        nipe.add("Espadas");
        nipe.add("Paus");
        nipe.add("Ouros");
        int aux=0;
        for(int i=0; i<=12; i++){
            if(i==12){
                if(aux<3){
                    aux++;
                    i=0;
                }
            }
            System.out.println(numero.get(i)+" "+nipe.get(aux));
        }        
    }
}