package com.sustentabilidade.service;

import com.sustentabilidade.model.ItensVendas;
import com.sustentabilidade.model.Material;
import com.sustentabilidade.model.Venda;
import java.util.ArrayList;

public class VendaService {

    public void adicionarItens(Venda venda, Material material, double v) {}


    public void adicionarItem(Venda venda, Material material, Double quantidade) {
        if (venda == null) throw new IllegalArgumentException("venda não pode ser null");
        if (material == null) throw new IllegalArgumentException("material não pode ser null");
        if (quantidade == null || quantidade <= 0) throw new IllegalArgumentException("quantidade inválida");

        if (venda.getItens() == null) {
            venda.setItens(new ArrayList<>());
        }

        ItensVendas item = new ItensVendas(material, quantidade, material.getPrecounitario());
        venda.getItens().add(item);
        System.out.println("Item adicionado: " + material.getNome() + " - " + quantidade + " " + material.getUnidadeMedida());
    }

    public void fecharVenda(Venda venda) {
        if (venda == null) throw new IllegalArgumentException("venda não pode ser null");
        double total = 0.0;
        if (venda.getItens() != null) {
            for (ItensVendas item : venda.getItens()) {
                if (item != null && item.getQuantidade() != null && item.getPrecoUnitario() != null) {
                    total += item.getQuantidade() * item.getPrecoUnitario();
                }
            }
        }
        venda.setTotal(total);
        System.out.println("Venda fechada. Total: R$ " + total);
    }

}
