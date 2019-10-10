//Crie uma classe que represente uma Pessoa, devendo ter as propriedades nome, peso altura e data de nascimento e o metodo IMC que retornará o valor IMC.

//crie uma classe
public class Pessoa {
    //propriedades nome, peso altura e data de nascimento
    String nome;
    double peso;
    double altura;
    String dtNasc;

    double imc(){
        return (this.peso/(this.altura*this.altura));
    }
}