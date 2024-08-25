package models;

public class PetShop {
    private String cnpj;
    private String nome;
    private Endereco endereco;

    public PetShop(String cnpj, Endereco endereco, String nome) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
