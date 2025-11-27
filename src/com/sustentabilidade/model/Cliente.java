package com.sustentabilidade.model;

public class Cliente extends Pessoa implements Identificavel {
    private String tipoCliente;

    public Cliente(Long id,
                   String nome,
                   String documento,
                   String email,
                   String telefone,
                   String tipoCliente) {
        super(id, nome, documento, email, telefone);
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {return tipoCliente;}
    public void setTipoCliente(String tipoCliente) {this.tipoCliente = tipoCliente;}


    public Long getId() {
        return super.getId();}

    @Override
    public String toString() {
        return "Cliente {" +
                "id = " + getId() +
                ", nome = '" + getNome() + '\'' +
                ", tipoCliente = '" + tipoCliente + '\'' +
                '}';
    }
}
