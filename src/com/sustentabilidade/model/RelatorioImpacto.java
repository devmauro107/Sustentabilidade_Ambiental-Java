package com.sustentabilidade.model;

import java.time.LocalDate;

public class RelatorioImpacto  {
    private LocalDate periodoInicio;
    private LocalDate periodoFim;
    private Double totalReciclado;
    private Double evitado;

    public RelatorioImpacto(
            LocalDate periodoInicio,
            LocalDate periodoFim,
            Double totalReciclado,
            Double evitado ) {
        this.periodoInicio =  periodoInicio;
        this.periodoFim = periodoFim;
        this.totalReciclado = totalReciclado;
        this.evitado = evitado;
    }

    @Override
    public String toString() {
        return " RelatorioImpacto {" +
                "periodoInicio = " + periodoInicio +
                ", periodoFim = " + periodoFim +
                ", totalReciclado = " + totalReciclado +
                ", evitado = " + evitado +
                '}';
    }
}
