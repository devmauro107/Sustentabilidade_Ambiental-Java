package com.sustentabilidade;

import com.sustentabilidade.controller.*;
import com.sustentabilidade.model.*;
import com.sustentabilidade.service.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Sustentabilidade Ambiental iniciado 🚀");

        Scanner scanner = new Scanner(System.in);

        Estoque estoque = new Estoque(1L, new HashMap<>());
        EstoqueService estoqueService = new EstoqueService(estoque);
        VendaService vendaService = new VendaService();
        NotaFiscalService nfService = new NotaFiscalService();
        RelatorioService relatorioService = new RelatorioService();

        ClienteController clienteController = new ClienteController();
        MaterialController materialController = new MaterialController();
        ColetaController coletaController = new ColetaController(estoqueService);
        VendaController vendaController = new VendaController(vendaService, estoqueService);
        NotaFiscalController nfController = new NotaFiscalController(nfService);
        RelatorioController relatorioController = new RelatorioController(relatorioService);

        Cliente cliente = null;
        Material material = null;
        Venda venda = null;

        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Cliente e Material");
            System.out.println("2 - Registrar Coleta");
            System.out.println("3 - Realizar Venda");
            System.out.println("4 - Emitir Nota Fiscal");
            System.out.println("5 - Gerar Relatório");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("Digite o nome do cliente:");
                        String nomeCliente = scanner.nextLine();
                    System.out.println("Digite o documento:");
                        String documentoCliente = scanner.nextLine();
                    System.out.println("Digite o email:");
                        String emailCliente = scanner.nextLine();
                    System.out.println("Digite o telefone:");
                        String telefoneCliente = scanner.nextLine();

                    cliente = new Cliente(1L, nomeCliente,
                            documentoCliente,
                            emailCliente,
                            telefoneCliente, "Pessoa Física");
                    clienteController.cadastrarCliente(cliente);

                    System.out.println("Digite o nome do material:");
                        String nomeMaterial = scanner.nextLine();
                    System.out.println("Digite o tipo:");
                        String tipoMaterial = scanner.nextLine();
                    System.out.println("Digite a unidade de medida:");
                        String unidadeMedida = scanner.nextLine();
                    System.out.println("Digite o preço unitário (use ponto ou vírgula):");
                        String precoTexto = scanner.nextLine().replace(",", ".");
                            double precoUnitario = Double.parseDouble(precoTexto);
                    System.out.println("Digite o fator de impacto CO2 (use ponto ou vírgula):");
                        String impactoTexto = scanner.nextLine().replace(",", ".");
                            double fatorImpacto = Double.parseDouble(impactoTexto);

                scanner.nextLine();

                        material = new Material(1L,
                                nomeMaterial,
                                tipoMaterial,
                                unidadeMedida,
                                precoUnitario,
                                fatorImpacto);
                        materialController.cadastrarMaterial(material);
                    break;

                case 2:
                    if (material == null) {
                        System.out.println("⚠️ Cadastre cliente e material antes de registrar coleta!");
                        break;
                    }
                    Coleta coleta = new Coleta(1L, LocalDateTime.now(), 100.0, StatusColeta.CONCLUIDA);
                    coletaController.registrarColeta(coleta, material);
                    break;

                case 3:
                    if (material == null) {
                        System.out.println("⚠️ Cadastre cliente e material antes de realizar venda!");
                        break;
                    }
                    venda = new Venda(1L, LocalDateTime.now(), new ArrayList<>(), 0.0);
                    System.out.println("Digite a quantidade a ser vendida (use ponto ou vírgula):");
                        String quantidadeTexto = scanner.nextLine().replace(",", ".");
                            double quantidadeVenda = Double.parseDouble(quantidadeTexto);
                    scanner.nextLine();
                        vendaController.realizarVenda(venda, material, quantidadeVenda);
                    break;

                case 4:
                    if (venda == null) {
                        System.out.println("⚠️ Realize uma venda antes de emitir nota fiscal!");
                        break;
                    }
                    nfController.emitirNotaFiscal(venda);
                    break;

                case 5:
                    relatorioController.gerarRelatorio(
                            LocalDateTime.now().toLocalDate(),
                            LocalDateTime.now().toLocalDate()
                    );
                    break;

                case 0:
                    System.out.println("Encerrando sistema... ✅");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
