package com.sustentabilidade.model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Long id;
    private Map<Material, Double> itens;

    public Estoque(Long id,
                   Map<Material, Double> itens) {
        this.id = id;
        this.itens = new HashMap<>();
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public Map<Material, Double> getItens() {return itens;}
    public void setItens(Map<Material, Double> itens) {this.itens = itens;}
}
