package org.example;

public class CartaoCredito extends Cartao {
    private double limite;

    public CartaoCredito(String numeroCartao, String titular, String bandeira, double limite) {
        super(numeroCartao, titular, bandeira);
        setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("Erro: Limite não pode ser negativo!");
        }
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Limite: "+limite);
    }

}
