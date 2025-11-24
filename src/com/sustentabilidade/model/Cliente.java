package com.sustentabilidade.model;

public class Cliente extends Pessoa{
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
}
