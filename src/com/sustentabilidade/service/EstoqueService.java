package com.sustentabilidade.service;

import com.sustentabilidade.model.Coleta;
import com.sustentabilidade.model.Venda;

public class EstoqueService {

        public void registrarColeta(Coleta coleta) {
            System.out.println("Coleta registrada no estoque.");
        }

        public void reservarParaVenda(Coleta venda) {
            System.out.println("Itens revisados para vendas.");
        }

        public void autorizarAposVenda(Venda venda) {
            System.out.println("Estoque atualizado após vendas.");
        }
        public Double consultarMaterialQuantidade(Long materialId) { return 0.0; }
    }
