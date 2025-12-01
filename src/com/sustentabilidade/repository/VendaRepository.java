package com.sustentabilidade.repository;

import com.sustentabilidade.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class VendaRepository {
    private List<Venda> vendas = new ArrayList<>();

    public void salvar(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> listarTodas() {
        return vendas;
    }
}
