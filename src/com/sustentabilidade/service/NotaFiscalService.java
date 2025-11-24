package com.sustentabilidade.service;

import com.sustentabilidade.model.NotaFiscal;
import com.sustentabilidade.model.Venda;

public class NotaFiscalService {

    public NotaFiscal emitir (Venda venda) {
        System.out.println("Nota fiscal emitida.");
        return null;}

    public Boolean validar (NotaFiscal nf) {
        System.out.println("Nota fiscal validada.");
        return true;}
}
