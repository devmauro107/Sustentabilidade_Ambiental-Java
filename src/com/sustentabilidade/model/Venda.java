package com.sustentabilidade.model;

import java.time.LocalDateTime;
import java.util.List;

public class Venda implements Identificavel {
    private Long id;
    private LocalDateTime data;
    private List<ItensVendas> itens;
    private Double total;

    public Venda(Long id,
                 LocalDateTime data,
                 List<ItensVendas> itens,
                 Double total) {
        this.id = id;
        this.data = data;
        this.itens = itens;
        this.total = total;
    }

    public Venda() {}

    public List<ItensVendas> getItens() {
        return itens;}

    public void setItens(List<ItensVendas> itens) {
        this.itens = itens;}

    public Double getTotal() {
        return total;}

    public void setTotal(Double total) {
        this.total = total;}

    @Override
    public Long getId() {
        return id;}

    @Override
    public String toString() {
        return " Vendas {" +
                "id = " + id +
                ", data = " + data +
                ", total = " + total +
                ", itens = " + itens +
                '}';
    }
}
