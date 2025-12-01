package com.sustentabilidade.repository;

import com.sustentabilidade.model.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialRepository {

    private List<Material> materiais = new ArrayList<>();

    public void salvar(Material material) {
        materiais.add(material);
    }

    public List<Material> listarTodos() {
        return materiais;
    }
}
