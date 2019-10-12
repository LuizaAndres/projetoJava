import java.util.Scanner;

public class DogSims{
    public static void main (String[] args){
        Cachorro dog1 = new Cachorro();
        Scanner novo = new Scanner(System.in);
        System.out.println("Qual o nome do seu Dogíneo?");
        dog1.nome= novo.nextLine();

        dog1.peso = 2000;
        dog1.comprimento = 15;
        dog1.idade = 0;
        dog1.energia= 8;
        dog1.fome = 2;
        dog1.sede = 4;
        dog1.stSede = "Au! Não estou com sede.";
        novo.close();
//criar menu        
        System.out.println("O que vc quer fazer?");

        dog1.xixizar();
        System.out.println(dog1.stSede);
        
        dog1.cagar();
        System.out.println(dog1.stFome);
    }
}

        
       