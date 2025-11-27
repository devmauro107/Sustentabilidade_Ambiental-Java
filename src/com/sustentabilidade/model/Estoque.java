package com.sustentabilidade.model;

import java.util.HashMap;
import java.util.Map;

public class Estoque implements Identificavel {
    private final Long id;
    private final Map<Material, Double> itens;

    public Estoque(Long id,
                   Map<Material, Double> itens) {
        this.id = id;
        this.itens = itens != null ? itens : new HashMap<>();
    }

    public Map<Material, Double> getItens() {
        return itens;
    }

    @Override
    public Long getId() {
        return id;}

    @Override
    public String toString() {
        return " Estoque {" +
                "id = " + id +
                ", itens = " + itens +
                '}';
    }

}
