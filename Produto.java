import java.util.ArrayList;
import java.util.List;

class Produto{
    //atrubutos
    String nome;
    Double valor;
    int quantidade;
    int vendidos;
    List<Cart> carts = new ArrayList<>();
    
    //construtor
    Produto(String nome, Double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade=quantidade;
    }

    //comunicacao com cart (lista)??
    
    void saida(){

        this.vendidos++;
        this.quantidade--;
        }
}