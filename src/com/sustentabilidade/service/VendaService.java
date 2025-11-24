package com.sustentabilidade.service;

import com.sustentabilidade.model.Material;
import com.sustentabilidade.model.Venda;

public class VendaService {

    public void adicionarItens(Venda venda, Material material, Double quantidade) {
        System.out.println("Itens adicionados à vendas.");
    }

    public void fecharVenda(Venda venda) {
        System.out.println("Venda fecjada com sucesso.");
    }
}
