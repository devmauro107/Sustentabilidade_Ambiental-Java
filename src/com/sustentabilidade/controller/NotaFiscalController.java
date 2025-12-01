package com.sustentabilidade.controller;

import com.sustentabilidade.model.NotaFiscal;
import com.sustentabilidade.model.Venda;
import com.sustentabilidade.repository.NotaFiscalRepository;
import com.sustentabilidade.service.NotaFiscalService;

public class NotaFiscalController {

    private NotaFiscalService nfService;
    private NotaFiscalRepository nfRepository = new NotaFiscalRepository();

    public NotaFiscalController(NotaFiscalService nfService) {
        this.nfService = nfService;
    }

    public void emitirNotaFiscal(Venda venda) {
        NotaFiscal nf = nfService.emitirNotaFiscal(venda);
        nfRepository.salvar(nf);
        System.out.println("Nota fiscal emitida: " + nf);
    }

    public void listarNotas() {
        System.out.println("Lista de notas fiscais:");
        nfRepository.listarTodas().forEach(System.out::println);
    }
}
