package com.sustentabilidade;

import com.sustentabilidade.model.*;
import com.sustentabilidade.service.EstoqueService;
import com.sustentabilidade.service.NotaFiscalService;
import com.sustentabilidade.service.RelatorioService;
import com.sustentabilidade.service.VendaService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Sustentabilidade Ambiental iniciado 🚀");

        Cliente cliente = new Cliente(
                1L,
                "Mauro",
                "123.456.789.00",
                "mauro@gmail.com",
                "123456789",
                "Pessoa Fizica"
        );
        System.out.println("Cliente criado: " + cliente.getNome());

        Material material = new Material(
                1L,
                "Plastico PET",
                "Plastico",
                "Kg",
                2.5,
                1.2
        );
        System.out.println("Material criado: " + material.getNome());

        Coleta coleta = new Coleta(
                1L,
                LocalDateTime.now(),
                100.0,
                StatusColeta.CONCLUIDA
        );
        EstoqueService estoqueService = new EstoqueService();
        estoqueService.registrarColeta(coleta);

        List<ItensVendas> itens = new ArrayList<>();
        itens.add(new ItensVendas(material, 50.0, material.getPrecounitario()));

        Venda venda = new Venda(
                1L,
                LocalDateTime.now(),
                itens,
                0.0
        );

        VendaService vendaService = new VendaService();
        vendaService.adicionarItens(venda, material, 50.0);
        vendaService.fecharVenda(venda);

        NotaFiscalService nfService = new NotaFiscalService();
        NotaFiscal nf = nfService.emitir(venda);
        nfService.validar(nf);

        RelatorioService relatorioService = new RelatorioService();
        relatorioService.gerarRelatorio(LocalDateTime.now().minusMonths(1).toLocalDate(), LocalDateTime.now().toLocalDate());

        System.out.println("Fluxo completo executado com sucesso!");

    }
}