package org.example;


import java.util.Scanner;

public class Agencia {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro Cartão de Crédito ===");

        System.out.println("Numero do cartão");
        String numeroCredito = sc.nextLine();

        System.out.println("Titular: ");
        String titularCredito = sc.nextLine();

        System.out.print("Bandeira (Visa/Mastercard/Elo): ");
        String bandeiraCredito = sc.nextLine();

        System.out.print("Limite: ");
        double limite = sc.nextDouble();
        sc.nextLine();

        CartaoCredito cc = new CartaoCredito(numeroCredito, titularCredito, bandeiraCredito, limite);

        System.out.println("\n=== Cadastro Cartão de Débito ===");

        System.out.print("Número do cartão: ");
        String numeroDebito = sc.nextLine();

        System.out.print("Titular: ");
        String titularDebito = sc.nextLine();

        System.out.print("Bandeira (Visa/Mastercard/Elo): ");
        String bandeiraDebito = sc.nextLine();

        System.out.print("Saldo em conta: ");
        double saldo = sc.nextDouble();

        CartaoDebito cd = new CartaoDebito(numeroDebito, titularDebito, bandeiraDebito, saldo);

        System.out.println("\n=== Dados do Cartão de Crédito ===");
        cc.exibirInfo();

        System.out.println("\n=== Dados do Cartão de Débito ===");
        cd.exibirInfo();

        sc.close();

    }
}
