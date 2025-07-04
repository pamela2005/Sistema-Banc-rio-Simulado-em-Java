package br.com.banco.service;

import br.com.banco.service;

import br.com.banco.model.*;

import java.util.ArrayList;
import java.util.List;

public class BancoService {
    @Override
    public String toString() {
        return "BancoService [contas=" + contas + ", toString()=" + super.toString() + "]";
    }

    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        return contas.stream()
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public void aplicarAtualizacaoMensal() {
        for (Conta c : contas) {
            c.atualizarMensal();
        }
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println ("Nenhuma conta cadastrada");
        } else {
            contas.forEach(System.out::println);
        }
    }
}