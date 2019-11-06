import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
class Cart{
    //atributos
    double total = 0.0;
    double desconto;
    String data;
    List<Produto> listaProduto = new ArrayList<>();
    Cliente cliente;

    Cart(String data, Cliente cliente){
        Calendar calendario = Calendar.getInstance();//calendario com data atual
        DateFormat formatadorDeData = DateFormat.getDateInstance(DateFormat.SHORT);//criei objeto que vai ajudar a formatar a data
        this.data = formatadorDeData.format(calendario.getTime());//a data do objeto re ebe a string da data atual

        this.cliente = cliente;
        cliente.cart.add(this);
    }
    //comunicacao com produtos (lista)
    

    //add produto
    void add(Produto produto){
        
        this.listaProduto.add(produto);
        produto.carts.add(this);

    }
    void calcularPreco(){
        for(Produto auxProduto:this.listaProduto){
            this.total += auxProduto.valor;
        }
        this.desconto = this.total * this.cliente.desconto;
    }   
}