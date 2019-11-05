public class Filme {
    int id_Filme;
    String nome_Filme;
    String dt_lanc;
    String sinopse;
    double valor;
    int estoque;
    int disponiveis;
    int alugados;
    //construtor de filmes
    Filme(int id_Filme, String nome_Filme, String dt_lanc, String sinopse, double valor, int estoque){
        this.id_Filme = id_Filme;
        this.nome_Filme = nome_Filme;
        this.dt_lanc = dt_lanc;
        this.sinopse = sinopse;
        this.estoque = estoque;
        this.disponiveis = estoque;
        this.alugados = 0;
        this.valor = valor;
    }
    //função que controla quantidade de filmes disponiveis
    void disponiveis(){
        this.disponiveis = this.disponiveis -1;
        this.alugados = this.alugados +1;
    }

}