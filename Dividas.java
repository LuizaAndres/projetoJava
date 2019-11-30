
public class Dividas extends Contas {
//atributos    
    double percentualDescontos;

//construtor
    public Dividas(int id){
        super(id);
        Set<dividas>;
    }
//construtor    

    public Dividas(int id, int mes, int ano, double valor, Pessoas pessoa, double percentualDescontos) {
        super(id, mes, ano, valor, pessoa);
        this.percentualDescontos = percentualDescontos;
        pessoa.dividas.add(this);
    }
    
//getters e setters      
    public double getPercentualDescontos() {
        return this.percentualDescontos;
    }

    public void setPercentualDescontos(double percentualDescontos) {
        this.percentualDescontos = percentualDescontos;
    }

    @Override
    public String toString() {
        return "{" +
            " percentualDescontos='" + getPercentualDescontos() + "'" +
            "}";
    }
//metodos
    public double calculaDesconto(){
        double result;
        double valor = getValor();
        double desconto = getPercentualDescontos();
        result = valor + (valor*desconto);

        return result;
    }
}