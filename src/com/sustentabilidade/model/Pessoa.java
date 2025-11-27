package com.sustentabilidade.model;

public abstract class Pessoa implements Identificavel {
    private Long id;
    private String nome;
    private String documento;
    private String email;
    private String telefone;

    public Pessoa(Long id,
                  String nome,
                  String documento,
                  String email,
                  String telefone) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;}

    public void setNome(String nome) {
        this.nome = nome;}

    public String getDocumento() {
        return documento;}

    public void setDocumento(String documento) {
        this.documento = documento;}

    public String getEmail() {
        return email;}

    public void  setEmail(String email) {
        this.email = email;}

    public String getTelefone() {
        return telefone;}

    public void setTelefone(String telefone) {
        this.telefone = telefone;}

    @Override
    public Long getId() {
        return id;}

    @Override
    public String toString() {
        return "Pessoa {" +
                "id = " + id +
                ", nome = '" + nome + '\'' +
                ", documento = '" + documento + '\'' +
                ", email = '" + email + '\'' +
                ", telefone = '" + telefone + '\'' +
                '}';
    }
}
