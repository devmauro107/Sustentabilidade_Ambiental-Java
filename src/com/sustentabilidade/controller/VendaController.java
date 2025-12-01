package com.sustentabilidade.controller;

import com.sustentabilidade.model.Material;
import com.sustentabilidade.model.Venda;
import com.sustentabilidade.repository.VendaRepository;
import com.sustentabilidade.service.EstoqueService;
import com.sustentabilidade.service.VendaService;

public class VendaController {

    private VendaService vendaService;
    private EstoqueService estoqueService;
    private VendaRepository vendaRepository = new VendaRepository();

    public VendaController(VendaService vendaService, EstoqueService estoqueService) {
        this.vendaService = vendaService;
        this.estoqueService = estoqueService;
    }

    public void realizarVenda(Venda venda, Material material, double quantidade) {
        vendaService.adicionarItem(venda, material, quantidade);
        estoqueService.atualizarAposVenda(venda);
        vendaRepository.salvar(venda);
        System.out.println("Venda realizada: " + venda);
    }

    public void listarVendas() {
        System.out.println("Lista de vendas:");
        vendaRepository.listarTodas().forEach(System.out::println);
    }
}

