package com.sustentabilidade.model;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {
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

    public long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public LocalDateTime getData() {return data;}
    public void setData(LocalDateTime data) {this.data = data;}

    public List<ItensVendas> getItens() {return itens;}
    public void setItens(List<ItensVendas> itens) {this.itens = itens;}

    public Double getTotal() {return total;}
    public void setTotal(Double total) {this.total = total;}
}
