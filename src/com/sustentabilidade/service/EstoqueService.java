package com.sustentabilidade.service;

import com.sustentabilidade.model.Coleta;
import com.sustentabilidade.model.Estoque;
import com.sustentabilidade.model.Venda;
import com.sustentabilidade.model.Material;
import com.sustentabilidade.model.ItensVendas;

import java.util.Objects;

public class EstoqueService {
    private final Estoque estoque;

    public void autorizarAposVenda(Venda venda) {
        if (venda == null || venda.getItens() == null) {
            System.out.println("Venda inválida ou sem itens.");
                return;
        }

        boolean todosDisponiveis = true;
        for (ItensVendas item : venda.getItens()) {
            Material m = item.getMaterial();
            Double qtdVenda = item.getQuantidade() != null ? item.getQuantidade() : 0.0;
            Double qtdEstoque = estoque.getItens().getOrDefault(m, 0.0);

            if (qtdEstoque < qtdVenda) {
                System.out.println("Estoque insuficiente para material: " + m.getNome()
                        + " (estoque: " + qtdEstoque + ", pedido: " + qtdVenda + ")");
                todosDisponiveis = false;
            }
        }

        if (!todosDisponiveis) {
            System.out.println("Autorização de venda negada por falta de estoque.");
            return;
        }

        for (ItensVendas item : venda.getItens()) {
            Material m = item.getMaterial();
            Double qtdVenda = item.getQuantidade() != null ? item.getQuantidade() : 0.0;
            Double qtdEstoque = estoque.getItens().getOrDefault(m, 0.0);
            estoque.getItens().put(m, qtdEstoque - qtdVenda);
        }

        System.out.println("Venda autorizada e estoque atualizado.");
    }

    public EstoqueService() {
        this.estoque = new Estoque(1L, null);
    }

    public void registrarColeta(@org.jetbrains.annotations.NotNull Material materia, @org.jetbrains.annotations.NotNull Coleta coleta) {
        Objects.requireNonNull(materia);

        Objects.requireNonNull(coleta);
        Double quantidadeAtual = estoque.getItens().getOrDefault(materia, 0.0);
        estoque.getItens().put(materia, quantidadeAtual + coleta.getQuantidade());

        System.out.println("Coleta registrada: "
                + materia.getNome() + " - "
                + coleta.getQuantidade() + " "
                + materia.getUnidadeMedida());
    }
}
