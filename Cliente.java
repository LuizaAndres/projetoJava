import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Cliente extends Usuario {
    int id;
    String endereco;
    String tel;
    Date dtCadastro = new Date();
    List<Venda> vendas = new ArrayList<>();

    Cliente(int idU, String userName, String psw, String nome, int id, String endereco, String tel){
        super(idU, userName, psw, nome);
        this.id=id;
        this.endereco=endereco;
        this.tel=tel;
        this.dtCadastro=new Date();
    }

    String nome(){
        return super.nome();
    }
    int qtdCompra(){
        return this.vendas.size();
    }
    int idCliente(){
        return this.id;
    }
    /*double valorcompra(){

    }*/
}