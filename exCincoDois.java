//  Crie um programa que receba a pessoa criada e verifique a classificação:
//	até  18,5 abaixo do peso;
//	18.6 24.9 peso ideal;
//	25 e 29.9 sobrepeso;
//	30 e 34.9 obesidade grau 1;
//	25 e 29.9 obesidade grau 2;
//	+ que  40 Obesidade morbida.

public class exCincoDois{
    public static void main (String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Maria";
        pessoa.altura = 1.6;
        pessoa.peso = 70;
        double imc = pessoa.imc();
        if(imc<18.5){
            System.out.println("abaixo do peso");
        }
            else if (imc<24.9){
                System.out.println("Peso ideal");
            }
                else if (imc<29.9){
                    System.out.println("Sobrepeso");
                }
                    else if (imc<34.9){
                        System.out.println("Obesidade grau 1");
                    }
                        else if (imc<39.9){
                            System.out.println("Obesidade GRau 2");
                        }
                            else if (imc>40){
                                System.out.println("Obesidade mórbida");
                        }
        System.out.println(imc);
    }
}