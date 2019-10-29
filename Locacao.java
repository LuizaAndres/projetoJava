import java.sql.Date;
import java.util.List;


public class Locacao{
    int id_Loc;
    Cliente id_Cliente;
    Cliente nome_Cliente;
    String dt_Loc;
    String dt_Dev;
    Float valor_Tot;
    //criando lista de filmes do carrinho
    List<Filme> filmes = new ArrayList<>();
    Date data=new Date();

    //criando o aluguel
    void Alugar(int id_Loc, Cliente id_Cliente, Cliente nome_Cliente){
        this.id_Loc = id_Loc;
        this.id_Cliente = id_Cliente;
        this.nome_Cliente= nome_Cliente;
        this.dt_Loc = data;
    }
    //retorna id da locação
    int Id_Locacao() {
        return id_Loc;
    }
    //adidiona filme na lista
    void addFilme(Filme filme){
        this.filmes.add(filme);
    }
    float calcValorTot(){
        for(Filme filme: filmes){
            this.valor_Tot = this.valor_Tot + filme.valor;
        }
        return valor_Tot;
    }
    void dataDev(){
        int dias = Cliente.dias_Dev;
    }
}