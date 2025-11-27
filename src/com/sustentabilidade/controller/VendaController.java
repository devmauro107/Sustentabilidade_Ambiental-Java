package com.sustentabilidade.controller;

import com.sustentabilidade.model.Material;
import com.sustentabilidade.model.Venda;
import com.sustentabilidade.service.EstoqueService;
import com.sustentabilidade.service.VendaService;

public class VendaController {
    private VendaService vendaService;
    private EstoqueService estoqueService;

    public VendaController(VendaService vendaService, EstoqueService estoqueService) {
        this.vendaService = vendaService;
        this.estoqueService = estoqueService;
    }

    public void realizarVenda(Venda venda, Material material, double quantidade) {
        vendaService.adicionarItem(venda, material, quantidade);
        vendaService.fecharVenda(venda);
        estoqueService.atualizarAposVenda(venda);

        System.out.println("Venda realizada: " + venda);
    }
}

