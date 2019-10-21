import java.util.Scanner;

public class DogSims{
    public static void main (String[] args){
        Cachorro dog1 = new Cachorro();
        Scanner novo = new Scanner(System.in);
        System.out.println("Qual o nome do seu Dogíneo?");
        dog1.nome= novo.nextLine();
        novo.close();
//criar menu        
        System.out.println("O que vc quer fazer?");
        int op = 0;
        switch(op){
            case 1:{
                System.out.println("Brincar");
                dog1.brincar();

            }
            case 2:{
                System.out.println("Comer");
            }
            case 3:{
                System.out.println("Dormir");
            }
            case 4:{
                System.out.println("Fazer xixi");
                dog1.xixizar();
                System.out.println(dog1.stSede);

            }
            case 5:{
                System.out.println("fazer coco");
                dog1.cagar();
                System.out.println(dog1.stFome);
            }
        } 
    }
}

        
       