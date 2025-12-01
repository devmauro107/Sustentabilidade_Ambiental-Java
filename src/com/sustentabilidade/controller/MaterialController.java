package com.sustentabilidade.controller;

import com.sustentabilidade.model.Material;
import com.sustentabilidade.repository.MaterialRepository;

public class MaterialController {

    private MaterialRepository materialRepository = new MaterialRepository();

    public void cadastrarMaterial(Material material) {
        materialRepository.salvar(material);
        System.out.println("Material cadastrado: " + material);
    }

    public void listarMateriais() {
        System.out.println("Lista de materiais:");
        materialRepository.listarTodos().forEach(System.out::println);
    }
}
