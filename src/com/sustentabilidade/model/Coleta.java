package com.sustentabilidade.model;

import java.time.LocalDateTime;

public class Coleta implements Identificavel {
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

    public Double getQuantidade() {
        return quantidade;}

    @Override
    public Long getId() {
        return id;}

    @Override
    public String toString() {
        return " Coleta {" +
                "id = " + id +
                ", data = " + data +
                ", quantidade = " + quantidade +
                ", status = " + status +
                '}';
    }

}
