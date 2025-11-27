package com.sustentabilidade.model;

import java.time.LocalDateTime;

public class NotaFiscal implements Identificavel {
    private Long id;
    private String numero;
    private LocalDateTime dataEmissao;
    private Double valorTotal;
    private String chaveAcesso;

    public NotaFiscal(Long id,
                      String numero,
                      LocalDateTime dataEmissao,
                      Double ValorTotal,
                      String ChaveAcesso) {
        this.id = id;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valorTotal = ValorTotal;
        this.chaveAcesso = ChaveAcesso;
    }
    @Override
    public Long getId() {
        return id;}

    public String getNumero() {
        return numero;}
    public Double getValorTotal() {
        return valorTotal;}
    public String getChaveAcesso() {
        return chaveAcesso;}

    @Override
    public String toString() {
        return " NotaFiscal {" +
                "id = " + id +
                ", numero = '" + numero + '\'' +
                ", dataEmissão = " + dataEmissao +
                ", valorTotal = " + valorTotal +
                ", chaveAcesso = '" + chaveAcesso + '\'' +
                '}';
    }
}
