package com.sustentabilidade.controller;

import com.sustentabilidade.model.RelatorioImpacto;
import com.sustentabilidade.service.NotaFiscalService;
import com.sustentabilidade.service.RelatorioService;

import java.time.LocalDate;

public class RelatorioController {

    private RelatorioService relatorioService;

    public RelatorioController(RelatorioService relatorioService) {
        this.relatorioService = relatorioService;
    }

    public void gerarRelatorio(LocalDate inicio, LocalDate fim) {
        RelatorioImpacto relatorio = relatorioService.gerarRelatorio(inicio, fim);
        System.out.println("Relatório Gerado: " + relatorio);
    }
}
