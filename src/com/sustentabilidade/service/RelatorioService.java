package com.sustentabilidade.service;

import com.sustentabilidade.model.RelatorioImpacto;
import java.time.LocalDate;

public class RelatorioService {

    public RelatorioImpacto gerarRelatorio (LocalDate inicio, LocalDate fim) {
        double totalReciclado = 150.0;{
            double co2Evitado = totalReciclado * 1.2;

        RelatorioImpacto relatorio = new RelatorioImpacto(
                inicio,
                fim,
                totalReciclado,
                co2Evitado
        );

            System.out.println("Relatorio gerado: "
                    + totalReciclado + " Kg reciclados | CO2 evitado: "
                    + co2Evitado + " Kg");
            return relatorio;
        }
    }
}