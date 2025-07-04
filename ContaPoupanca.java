package br.com.banco.model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    @Override
    public void atualizarMensal() {
        double rendimento = getSaldo() * 0.01; // 1% ao mês
        depositar(rendimento);
    }
}