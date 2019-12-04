public class Proventos extends Contas{
//atributos
    double imposto;

//construtor
    public Proventos() {
    }
    
//construtor
    public Proventos(int id, int mes, int ano, double valor, Pessoas pessoa, double imposto) {
        super(id, mes, ano, valor, pessoa);
        this.imposto = imposto;
    }
//getters e setters
    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Proventos imposto(double imposto) {
        this.imposto = imposto;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proventos)) {
            return false;
        }
        Proventos proventos = (Proventos) o;
        return imposto == proventos.imposto;
    }

    @Override
    public String toString() {
        return "{" +
            " imposto='" + getImposto() + "'" +
            "}";
    }
//metodos
    double calculaImposto(){
        double result;
        double valor = getValor();
        double imposto = getImposto();
        result = valor - (valor*imposto);
        return result;
    }
}