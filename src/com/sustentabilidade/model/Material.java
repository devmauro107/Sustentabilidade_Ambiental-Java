package com.sustentabilidade.model;

public class Material implements Identificavel {
    private Long id;
    private String nome;
    private String tipo;
    private String unidadeMedida;
    private Double precounitario;
    private Double fatorImpacto;

    public Material(Long id,
                    String nome,
                    String tipo,
                    String unidadeMedida,
                    Double precounitario,
                    Double fatorImpacto) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.unidadeMedida = unidadeMedida;
        this.precounitario = precounitario;
        this.fatorImpacto = fatorImpacto;
    }

    public String getNome() {
        return nome;}

    public String getUnidadeMedida() {
        return unidadeMedida;}

    public Double getPrecounitario() {
        return precounitario;}

    @Override
    public  Long getId() {
        return id;}

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                ", precounitario=" + precounitario +
                ", fatorImpacto=" + fatorImpacto +
                '}';
    }
}
