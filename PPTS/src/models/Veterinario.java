package models;

import java.util.List;

public class Veterinario extends Funcionario{


    private String telefone;

    public Veterinario(String nome, String id, String email, String telefone) {
        super(nome, id, email);
        this.telefone = telefone;
    }

    public Veterinario() {
        super();
    }
}

