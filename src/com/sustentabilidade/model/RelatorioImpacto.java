package com.sustentabilidade.model;

import java.time.LocalDate;

public class RelatorioImpacto {
    private LocalDate periodoInicio;
    private LocalDate periodoFim;
    private Double totalReciclado;
    private Double evitado;

    public RelatorioImpacto(LocalDate periodoInicio,
                            LocalDate periodoFim,
                            Double totalReciclado,
                            Double evitado ) {
        this.periodoInicio =  periodoInicio;
        this.periodoFim = periodoFim;
        this.totalReciclado = totalReciclado;
        this.evitado = evitado;
    }

    public LocalDate getPeriodoInicio() {return periodoInicio;}
    public void setPeriodoInicio(LocalDate periodoInicio) {this.periodoInicio = periodoInicio;}

    public LocalDate getPeriodoFim() {return periodoFim;}
    public void setPeriodoFim(LocalDate periodoFim) {this.periodoFim = periodoFim;}

    public Double getTotalReciclado() {return totalReciclado;}
    public void setTotalReciclado(Double totalReciclado) {this.totalReciclado = totalReciclado;}

    public Double getEvitado() {return evitado;}
    public void setEvitado(Double evitado) {this.evitado = evitado;}
}
