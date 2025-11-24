package com.sustentabilidade.model;

import java.time.LocalDateTime;

public class Coleta {
    private Long id;
    private LocalDateTime data;
    private Double quantidade;
    private StatusColeta status;

    public Coleta(Long id,
                  LocalDateTime data,
                  Double quantidade,
                  StatusColeta status) {
        this.id = id;
        this.data = data;
        this.quantidade =quantidade;
        this.status = status;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public LocalDateTime getData() {return data;}
    public void setData(LocalDateTime data) {this.data = data;}

    public Double getQuantidade() {return quantidade;}
    public void setQuantidade(Double quantidade) {this.quantidade = quantidade;}

    public StatusColeta getStatus() {return status;}
    public void setStatus(StatusColeta status) {this.status = status;}
}
