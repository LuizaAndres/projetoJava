//FUP que una duas listas de inteiros
import java.util.ArrayList;
public class listaQuatroExSeis {
    
    public static void main(String[] args){
        ArrayList<String> legumes = new ArrayList<>();
        legumes.add("chuchu");
        legumes.add("Batata");
        legumes.add("Cenoura");
        legumes.add("Beterraba");
        legumes.add("Cebola");
        legumes.add("Abobrinha");
        System.out.println("Legumes: " + (legumes));
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Pêssego");
        System.out.println("Frutas: " + (frutas));
        
        ArrayList<String> listaDupla = new ArrayList<>();
	    listaDupla.addAll(legumes);
	    listaDupla.addAll(frutas);
	    System.out.println("Concatenação da Lista 1 com Lista 2: " + (listaDupla));
    }
}

