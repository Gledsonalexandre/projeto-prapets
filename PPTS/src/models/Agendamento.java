package models;

import java.time.LocalDateTime;

public class Agendamento {

    private int id;

    private LocalDateTime dataHora;

    private PetShop petShop;

    private Funcionario funcionario;

    private Pet pet;
    private Servico servico;

    public Agendamento(PetShop petShop, LocalDateTime dataHora, int id, Pet pet, Funcionario funcionario, Servico servico) {
        this.petShop = petShop;
        this.dataHora = dataHora;
        this.id = id;
        this.pet = pet;
        this.funcionario = funcionario;
        this.servico = servico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PetShop getPetShop() {
        return petShop;
    }

    public void setPetShop(PetShop petShop) {
        this.petShop = petShop;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
