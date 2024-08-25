package models;

import java.util.Date;

public class Consulta {

    private int id;

    private Date dataHora;

    private String local;

    private Veterinario veterinario;

    private Pet pet;



    public Consulta(int id, Date dataHora, String local, Veterinario veterinario, Pet pet) {

        this.id = id;

        this.dataHora = dataHora;

        this.local = local;

        this.veterinario = veterinario;

        this.pet = pet;

    }



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public Date getDataHora() {

        return dataHora;

    }



    public void setDataHora(Date dataHora) {

        this.dataHora = dataHora;

    }



    public String getLocal() {

        return local;

    }



    public void setLocal(String local) {

        this.local = local;

    }



    public Veterinario getVeterinario() {

        return veterinario;

    }



    public void setVeterinario(Veterinario veterinario) {

        this.veterinario = veterinario;

    }



    public Pet getPet() {

        return pet;

    }



    public void setPet(Pet pet) {

        this.pet = pet;

    }

}
