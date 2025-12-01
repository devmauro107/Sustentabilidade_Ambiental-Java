package com.sustentabilidade.repository;

import com.sustentabilidade.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarTodos() {
        return clientes;
    }
}
