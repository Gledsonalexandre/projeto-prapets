package models;

import java.util.List;

public class Usuario {

    private int id;

    private String nome;

    private String senha;

    private String telefone;

    private Endereco endereco;

    private List<Pet> pets;



    public Usuario(int id, String nome, String senha, String telefone, Endereco endereco, List<Pet> pets) {

        this.id = id;

        this.nome = nome;

        this.senha = senha;

        this.telefone = telefone;

        this.endereco = endereco;

        this.pets = pets;

    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getNome() {

        return nome;

    }



    public void setNome(String nome) {

        this.nome = nome;

    }



    public String getSenha() {

        return senha;

    }



    public void setSenha(String senha) {

        this.senha = senha;

    }



    public String getTelefone() {

        return telefone;

    }



    public void setTelefone(String telefone) {

        this.telefone = telefone;

    }



    public Endereco getEndereco() {

        return endereco;

    }



    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;

    }



    public List<Pet> getPets() {

        return pets;

    }



    public void setPets(List<Pet> pets) {

        this.pets = pets;

    }

}
