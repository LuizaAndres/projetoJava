import java.util.Objects;

public class Pessoas {
//atributos 
    private int id;
    private String nome;
    private String email;

//construtor
    public Pessoas() {
    }
//construtor de id usa no bd
    public Pessoas(int id){
        this.id=id;
    }
//construtor dos outros atributos usa no BD
    public Pessoas(String nome, String email){
        this.nome=nome;
        this.email=email;
    }
//construotr geral
    public Pessoas(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
//getters e setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoas id(int id) {
        this.id = id;
        return this;
    }

    public Pessoas nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoas email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        Pessoas pessoas = (Pessoas) o;
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