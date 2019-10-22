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
    boolean bola;
    
    Dono dog1 = new Dono();
    Cachorro() {
        this.peso = 2000;
        this.comprimento = 15;
        this.idade = 0;
        this.energia= 8;
        this.fome = 2;
        this.sede = 4;
        this.stSede = "Au! Não estou com sede.";
        this.stFome = "Au! Não estou com fome";
        this.bola = false;
    }
    void comer(){
        if (this.fome>=0){
            this.fome--;
        }
        if(this.sede>=0){
            this.sede++;
        }
    }
    void dormir(){
        if (this.energia<=10){
            this.energia++;
        }
        if (this.idade<20){
            this.comprimento++;
        }
    }

    void brincar(){
        if ((this.energia<4)||(this.fome>7)||(this.sede>7)){
            System.out.println("Não quero brincar");
        } else {
            this.energia--;
            this.fome++;
            this.sede++;
            dog1.fetch();      
        }
    }

    void cagar(){
        if (this.fome<10){
            this.fome--;
        }
        if (this.fome<5){
            this.stFome="Au! Não estou com fome.";
        }
        else if (this.fome<9){
            this.stFome="Au Au! Estou com fome.";
        }
        else if(this.fome==10){
            this.stFome="Grrrrr!! Estou morrendo de fome.";
        }        
    }
    void xixizar(){
        if (this.sede<10){
            this.sede++;
        }
        if (this.sede<5){
            this.stSede="Au! Não estou com sede.";
        }
        else if (this.sede<9){
            this.stSede="Au! Au! Estou com sede.";
        }
        else if(this.sede==10){
            this.stSede="Grrrr!! Estou morrendo de sede.";
        }
    }
}
