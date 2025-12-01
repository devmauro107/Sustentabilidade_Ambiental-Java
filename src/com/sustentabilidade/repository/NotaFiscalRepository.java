package com.sustentabilidade.repository;

import com.sustentabilidade.model.NotaFiscal;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscalRepository {
    private List<NotaFiscal> notas = new ArrayList<>();

    public void salvar(NotaFiscal nf) {
        notas.add(nf);
    }

    public List<NotaFiscal> listarTodas() {
        return notas;
    }
}
