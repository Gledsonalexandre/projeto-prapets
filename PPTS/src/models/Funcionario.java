package models;

public class Funcionario {
    private String id;
    private String nome;
    private String email;

    public Funcionario(String nome, String id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }
    public Funcionario(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
