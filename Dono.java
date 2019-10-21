public class Dono{
    String nome;
    boolean bola = false;

    void fetch(){
        if (bola){
            System.out.println("Voce jogou a bola");
            this.bola = false;
        } else {
            System.out.println("O Dog trouxe a bola");
            this.bola = true;
        }
    }
}