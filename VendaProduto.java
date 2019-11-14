public class VendaProduto {
    Venda venda;
    Produto produto;
    int quantidade;

    VendaProduto(Venda venda, Produto produto, int quantidade){
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}