package com.sustentabilidade.model;

public class Fornecedor extends Pessoa{
    private String categoria;

    public Fornecedor(Long id,
                      String nome,
                      String documento,
                      String email,
                      String telefone,
                      String categoria) {
        super(id, nome, documento,email, telefone);
        this.categoria = categoria;
    }

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this. categoria = categoria;}
}
