package org.example;

public class Cartao {
    private String numeroCartao;
    private String titular;
    private String bandeira;


    public Cartao(String numeroCartao, String titular, String bandeira) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        setBandeira(bandeira);
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public String getBandeira() {
        return bandeira;
    }


    public void setBandeira(String bandeira) {
        if (bandeira != null &&
                (bandeira.equalsIgnoreCase("Visa") ||
                        bandeira.equalsIgnoreCase("Mastercard") ||
                        bandeira.equalsIgnoreCase("Elo"))) {

            this.bandeira = bandeira;

        } else {
            System.out.println("Erro: Bandeira inválida!");
        }
    }

    public void exibirInfo(){
        System.out.println("\n"+"Numero Cartão: "+numeroCartao);
        System.out.println("Titular: "+titular);
        System.out.println("Bandeira: "+bandeira+"\n");
    }
}
