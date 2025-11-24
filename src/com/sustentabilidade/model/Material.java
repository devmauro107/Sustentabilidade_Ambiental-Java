package com.sustentabilidade.model;

public class Material {
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

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getUnidadeMedida() {return unidadeMedida;}
    public void setUnidadeMedida(String unidadeMedida) {this.unidadeMedida = unidadeMedida;}

    public Double getPrecounitario() {return precounitario;}
    public void setPrecounitario(Double precounitario) {this.precounitario = precounitario;}

    public Double getFatorImpacto() {return fatorImpacto;}
    public void setFatorImpacto(Double fatorImpacto) {this.fatorImpacto = fatorImpacto;}
}
