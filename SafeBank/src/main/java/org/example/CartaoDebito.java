package org.example;

public class CartaoDebito extends Cartao {
    private double saldoConta;

    public CartaoDebito(String numeroCartao, String titular, String bandeira, double saldoConta) {
        super(numeroCartao, titular, bandeira);
        setSaldoConta(saldoConta);
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        if (saldoConta >= 0) {
            this.saldoConta = saldoConta;
        } else {
            System.out.println("Erro: Saldo não pode ser negativo!");
        }
    }
}
