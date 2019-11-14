class Produto{
    int id;
    String nome;
    double preco;

    Produto(int id, String nome, double preco){
        this.id=id;
        this.nome=nome;
        this.preco=preco;
    }

    
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
        /**
         * @return the nome
         */
        public String getNome() {
            return nome;
        }
        /**
         * @return the preco
         */
        public double getPreco() {
            return preco;
        }
    

}