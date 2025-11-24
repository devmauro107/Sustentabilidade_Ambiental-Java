package com.sustentabilidade.model;

import java.time.LocalDateTime;

public class NotaFiscal {
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

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public LocalDateTime getDataEmissao() {return dataEmissao;}
    public void setDataEmissao(LocalDateTime dataEmissao) {this.dataEmissao = dataEmissao;}

    public Double getValorTotal() {return valorTotal;}
    public void setValorTotal(Double valorTotal) {this.valorTotal = valorTotal;}

    public String getChaveAcesso() {return chaveAcesso;}
    public void setChaveAcesso(String chaveAcesso) {this.chaveAcesso = chaveAcesso;}
}
