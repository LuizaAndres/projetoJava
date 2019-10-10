//CUP que receba a conta corrente e deposite e saque valores, ao final imprimindo o saldo existente.

public class BancoDois{
    public static void main (String[] args){

        Banco conta1 = new Banco();
        conta1.cc = "14589-x";
        conta1.ag = "1587-d";
        conta1.saldo = 10000;
        conta1.nome = "Ana Maria dos Bolinhos doces";
        
        conta1.deposito();
        conta1.saque();
        conta1.saque();
        conta1.saque();
        conta1.saque();
        conta1.saque();
        conta1.saldo();
        System.out.println(conta1.saldo());
        
    }
}