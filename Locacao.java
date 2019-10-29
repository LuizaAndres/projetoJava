import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Locacao{
    int idLoc;
    Cliente cliente;
    Date dtLoc;
    String dtDev;
    double valorTot;
    //criando lista de filmes do carrinho
    List<Filme> filmes = new ArrayList<>();
    Date data=new Date();

    //construtor
    Locacao(int idLoc, Cliente cliente){
        this.idLoc = idLoc;
        this.cliente = cliente;
        this.dtLoc = data;
    }
    //retorna id da locação
    int Id_Locacao() {
        return idLoc;
    }
    //adidiona filme na lista
    void AddFilme(Filme idFilme){
        this.filmes.add(filmes);
    }
    double calcValorTot(){
        for(Filme filme: filmes){
            this.valorTot = this.valorTot + filme.valor;
        }
        return valorTot;
    }
    void dataDev(){
        int dias = Cliente.diasDev;
    }
}