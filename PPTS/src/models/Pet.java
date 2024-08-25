package models;

import java.time.LocalDate;

import java.util.List;



public class Pet {

    private int id;

    private String nome;

    private String especie;

    private String raca;

    private LocalDate dataNascimento;

    private Usuario usuario;

    private Veterinario veterinario;

    private List<Servico> servico;

    private List<Consulta> consulta;

    private List<Vacina> vacina;



    public  void apresentar(){

        System.out.println("------------------- ");

        System.out.println("Olá, meu nome é: " + getNome());

        System.out.println("sou da raça " + getRaca() + ","  + " espécie " + getEspecie() + " e nasci em  " +

                getDataNascimento());

        if(usuario!= null){

            System.out.println("Meu dono é: " + usuario.getNome());

        }



    }



    public Pet(int id, String nome, String especie, String raca, int dataNascimento, Usuario usuario,

               Veterinario veterinario, List<Servico> servico, List<Consulta> consulta, List<Vacina> vacina) {

        this.id = id;

        this.nome = nome;

        this.especie = especie;

        this.raca = raca;

        this.dataNascimento = LocalDate.ofEpochDay(dataNascimento);

        this.usuario = usuario;

        this.veterinario = veterinario;

        this.servico = servico;

        this.consulta = consulta;

        this.vacina = vacina;

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



    public String getEspecie() {

        return especie;

    }



    public void setEspecie(String especie) {

        this.especie = especie;

    }



    public String getRaca() {

        return raca;

    }



    public void setRaca(String raca) {

        this.raca = raca;

    }



    public LocalDate getDataNascimento() {

        return dataNascimento;

    }



    public void setDataNascimento(LocalDate dataNascimento) {

        this.dataNascimento = dataNascimento;

    }



    public Usuario getUsuario() {

        return usuario;

    }



    public void setUsuario(Usuario usuario) {

        this.usuario = usuario;

    }



    public Veterinario getVeterinario() {

        return veterinario;

    }



    public void setVeterinario(Veterinario veterinario) {

        this.veterinario = veterinario;

    }



    public List<Servico> getServico() {

        return servico;

    }



    public void setServico(List<Servico> servico) {

        this.servico = servico;

    }



    public List<Consulta> getConsulta() {

        return consulta;

    }



    public void setConsulta(List<Consulta> consulta) {

        this.consulta = consulta;

    }



    public List<Vacina> getVacina() {

        return vacina;

    }



    public void setVacina(List<Vacina> vacina) {

        this.vacina = vacina;

    }

}

