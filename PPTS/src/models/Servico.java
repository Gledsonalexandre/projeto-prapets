package models;

import java.util.List;

public class Servico {

    private int id;

    private String nome;

    private String descricao;

    private double preco;





    public Servico(int id, String nome, String descricao, double preco, List<Pet> pets) {

        this.id = id;

        this.nome = nome;

        this.descricao = descricao;

        this.preco = preco;

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



    public String getDescricao() {

        return descricao;

    }



    public void setDescricao(String descricao) {

        this.descricao = descricao;

    }



    public double getPreco() {

        return preco;

    }



    public void setPreco(double preco) {

        this.preco = preco;

    }



    public List<Pet> getPets() {

        return pets;

    }



    public void setPets(List<Pet> pets) {

        this.pets = pets;

    }

}
