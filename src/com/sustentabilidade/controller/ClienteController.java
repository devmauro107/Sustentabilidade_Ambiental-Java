package com.sustentabilidade.controller;

import com.sustentabilidade.model.Cliente;

public class ClienteController {

    public void cadastrarCliente(Cliente cliente) {
        System.out.println("Cadastro do Cliente: " + cliente);
    }

    public void listarClientes(Cliente cliente) {
        System.out.println("Dados do Clientes: " + cliente);
    }
}