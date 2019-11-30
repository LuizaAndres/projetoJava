import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Pessoas {
//atributos 
    private int id;
    private String nome;
    private String email;
    private HashSet<Dividas> dividas = new HashSet<>();
    private HashSet<Proventos> proventos = new HashSet<>();


    public Pessoas() {
    }

    public Pessoas(int id, String nome, String email, HashSet<Dividas> dividas, HashSet<Proventos> proventos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dividas = dividas;
        this.proventos = proventos;
    }

    public HashSet<Dividas> getDividas() {
        return this.dividas;
    }

    public void setDividas(HashSet<Dividas> dividas) {
        this.dividas = dividas;
    }

    public HashSet<Proventos> getProventos() {
        return this.proventos;
    }

    public void setProventos(HashSet<Proventos> proventos) {
        this.proventos = proventos;
    }

    public Pessoas dividas(HashSet<Dividas> dividas) {
        this.dividas = dividas;
        return this;
    }

    public Pessoas proventos(HashSet<Proventos> proventos) {
        this.proventos = proventos;
        return this;
    }

//construtor busca id no banco
    public Pessoas(final int id){
        this.id=id;
    }
//construtor grava obj no banco
    public Pessoas(final String nome, final String email){
        this.nome=nome;
        this.email=email;
    }
//cria obj na tela
    public Pessoas(final int id, final String nome, final String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
//getters e setters
    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Pessoas id(final int id) {
        this.id = id;
        return this;
    }

    public Pessoas nome(final String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoas email(final String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        final Pessoas pessoas = (Pessoas) o;
        return id == pessoas.id && Objects.equals(nome, pessoas.nome) && Objects.equals(email, pessoas.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }

}