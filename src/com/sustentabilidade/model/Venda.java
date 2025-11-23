package com.sustentabilidade.model;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {
    private Long id;
    private LocalDateTime data;
    private List<ItensVendas> itens;
    private Double total;
}
