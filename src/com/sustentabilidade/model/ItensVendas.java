package com.sustentabilidade.model;

public class ItensVendas {
    private Material material;
    private Double quantidade;
    private Double precoUnitario;

    public ItensVendas(Material material,
                       Double quantidade,
                       Double precoUnitario) {
        this.material = material;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Material getMaterial() {return material;}
    public void setMaterial(Material material) {this.material = material;}

    public Double getQuantidade() {return quantidade;}
    public void setQuantidade(Double quantidade) {this.quantidade = quantidade;}

    public Double getPrecoUnitario() {return precoUnitario;}
    public void setPrecoUnitario(Double precoUnitario) {this.precoUnitario = precoUnitario;}
}
