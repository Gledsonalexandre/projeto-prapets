package models;

public class Endereco {
    private String cep;
    private String rua;
    private String cidade;
    private String estado;

    public Endereco(String cep, String estado, String rua, String cidade) {
        this.cep = cep;
        this.estado = estado;
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
