package com.sustentabilidade.controller;

import com.sustentabilidade.model.Cliente;
import com.sustentabilidade.repository.ClienteRepository;

public class ClienteController {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrarCliente(Cliente cliente) {
        clienteRepository.salvar(cliente);
        System.out.println("Cliente cadastrado: " + cliente);
    }

    public void listarClientes() {
        System.out.println("Lista de clientes:");
        clienteRepository.listarTodos().forEach(System.out::println);
    }

}