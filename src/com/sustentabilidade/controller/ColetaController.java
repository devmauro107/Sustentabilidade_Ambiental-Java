package com.sustentabilidade.controller;

import com.sustentabilidade.model.Coleta;
import com.sustentabilidade.model.Material;
import com.sustentabilidade.service.EstoqueService;

public class ColetaController {

    private final EstoqueService estoqueService;

    public ColetaController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    public void registrarColeta(Coleta coleta, Material material) {
        estoqueService.registrarColeta(material, coleta);
        System.out.println("Coleta registrada " + coleta);
    }
}
