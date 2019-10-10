//crie uma classe que represente uma conta corrente, devendo ter as propriedades: numero da conta, agencia, saldo, nome do titular e os metodos deposito, saque e saldo total.

public class Banco {
    //propriedades nome, peso altura e data de nascimento
    String cc;
    String ag;
    double saldo;
    String nome;

    double deposito(){
        return (this.saldo++);
    }
    double saldo(){
        return (this.saldo);
    }
    double saque(){
        return (this.saldo--);
    }
}