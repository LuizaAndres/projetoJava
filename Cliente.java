import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Cliente{
    //atributos
    String nome;
    Date dtNasc;
    double desconto;

    //construtor
    Cliente(String nome, Date dtNasc, double desconto){
        this.nome=nome;
        this.dtNasc = dtNasc;
        this.desconto = desconto;
    }

    //comunicacao com cart
    List<Cart> cart = new ArrayList<>();

    //metodos
}