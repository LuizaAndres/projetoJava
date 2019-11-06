import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
class Loja{
    public static void main(String[] args){
       // List<Cart> cart = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        
        //criando cliente
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);

        //criando produto
        Produto produto1 = new Produto("oculos", 120.30, 100);
        Produto produto2 = new Produto("luva", 200.0, 200);
        Produto produto3 = new Produto("Jaqueta", 550.1, 20);
        try{
            Cliente cliente1 = new Cliente("Alfredo",format.parse("12/01/1995"), 0.15);

            System.out.println(cliente1.dtNasc);
        
        /*//definindo outro metodo pra setar a data
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR,1995);
        calendario.set(Calendar.MONTH,0);
        calendario.set(Calendar.DATE,12);
        System.out.println(calendario.getTime());*/

        //novo pedido cliente 1
        Cart cart = new Cart("12/12/1993", cliente1);
        cart.add(produto1);
        cart.add(produto3);
        //adicionando produtos no carrinho
        Cart cart1 = new Cart("10/10/2003", cliente1);
        cart1.add(produto2);

    
        cart.calcularPreco();
        System.out.println(cart.total);
        System.out.println("O desconto é: " + cart.desconto);
    } catch (Exception e){
        System.out.println(e.getMessage());
    }     
    }
}