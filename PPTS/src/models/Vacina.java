package models;

import java.util.Date;

import java.util.List;



public class Vacina {

    private int id;

    private String local;

    private Date data;

    private String tipoDeVacina;

    private List<Pet> pets;



    public Vacina(int id, String local, Date data, String tipoDeVacina, List<Pet> pets) {

        this.id = id;

        this.local = local;

        this.data = data;

        this.tipoDeVacina = tipoDeVacina;

        this.pets = pets;

    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getLocal() {

        return local;

    }



    public void setLocal(String local) {

        this.local = local;

    }



    public Date getData() {

        return data;

    }



    public void setData(Date data) {

        this.data = data;

    }



    public String getTipoDeVacina() {

        return tipoDeVacina;

    }



    public void setTipoDeVacina(String tipoDeVacina) {

        this.tipoDeVacina = tipoDeVacina;

    }



    public List<Pet> getPets() {

        return pets;

    }



    public void setPets(List<Pet> pets) {

        this.pets = pets;

    }

}


