package com.sustentabilidade.controller;

import com.sustentabilidade.model.NotaFiscal;
import com.sustentabilidade.model.Venda;
import com.sustentabilidade.service.NotaFiscalService;

public class NotaFiscalController {
    private NotaFiscalService nfService;

    public NotaFiscalController(NotaFiscalService nfService) {
        this.nfService = nfService;
    }

    public void emitirNotaFiscal(Venda venda) {
        NotaFiscal nf = nfService.emitir(venda);
        nfService.validar(nf);

        System.out.println("Nota Fiscal emitida: " + nf);
    }
}
