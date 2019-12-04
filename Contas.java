import java.util.Objects;

public class Contas {
//atributos
    int id;
    int mes;
    int ano;
    double valor;
    Pessoas pessoa;
//construtor geral
    public Contas() {
    }
//construtor especifico que passa pelo extends
    public Contas(int id, int mes, int ano, double valor, Pessoas pessoa) {
        this.id = id;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.pessoa = pessoa;
    }
//getters e setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoas getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoas pessoa) {
        this.pessoa = pessoa;
    }
//quals
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contas)) {
            return false;
        }
        Contas contas = (Contas) o;
        return id == contas.id && mes == contas.mes && ano == contas.ano && valor == contas.valor && Objects.equals(pessoa, contas.pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mes, ano, valor, pessoa);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", mes='" + getMes() + "'" +
            ", ano='" + getAno() + "'" +
            ", valor='" + getValor() + "'" +
            ", pessoa='" + getPessoa() + "'" +
            "}";
    }

}