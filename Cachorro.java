public class Cachorro {
     
    String nome;
    int peso;
    int comprimento;
    int idade;
    int energia;
    int fome;
    int sede;
    String stSede;
    String stFome;
    /*
    int comer(){
        if (this.fome>=0){
            this.fome--;
        }
        if(this.sede>=0){
            this.sede++;
        }
    }
    int dormir(){
        if (this.energia<=10){
            this.energia++;
        }
        if (this.idade<20){
            this.comprimento++;
        }
    }
    int brincar(){
        this.energia--;
        return true
    }*/
    void cagar(){
        if (this.fome<10){
            this.fome++;
        }
        if (this.fome<5){
            this.stFome="não estou com fome.";
        }
        else if (this.fome<9){
            this.stFome="estou com fome.";
        }
        else if(this.fome==10){
            this.stFome="Estou morrendo de fome.";
        }
    }
    void xixizar(){
        if (this.sede<10){
            this.sede++;
        }
        if (this.sede<5){
            this.stSede="não estou com sede.";
        }
        else if (this.sede<9){
            this.stSede="estou com sede.";
        }
        else if(this.sede==10){
            this.stSede="Estou morrendo de sede.";
        }
    }
}
