package com.sustentabilidade.controller;

import com.sustentabilidade.model.Material;

public class MaterialController {

    public void cadastrarMaterial(Material material) {
        System.out.println("Cadastro de Material");
    }

    public void listarMaterial(Material material) {
        System.out.println("Dados do Material: " + material);
    }
}
