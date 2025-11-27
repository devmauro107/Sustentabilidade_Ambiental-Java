package com.sustentabilidade.service;

import com.sustentabilidade.model.NotaFiscal;
import com.sustentabilidade.model.Venda;

import java.time.LocalDateTime;
import java.util.UUID;

public class NotaFiscalService {

    public NotaFiscal emitir (Venda venda) {
        String chave = UUID.randomUUID().toString();
        NotaFiscal nf = new NotaFiscal(
                1L,
                "NF- " + venda.getId(),
                LocalDateTime.now(),
                venda.getTotal(),
                chave
        );
        System.out.println("Nota fiscal emitida." + nf.getNumero() + " | Valor: R$ " + nf.getValorTotal());
            return nf;
    }

    public Boolean validar (NotaFiscal nf) {
        boolean valido = nf != null && nf.getChaveAcesso() != null && !nf.getChaveAcesso().isEmpty();

        System.out.println("Nota fiscal validada." + nf.getNumero() + " | Válida: " + valido);
        return valido;}
}
