package com.javabank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");

        conta.depositar(new BigDecimal("100"));
        conta.sacar(new BigDecimal("30"));
        System.out.println("Saldo: " + conta.getSaldo());

        try {
            conta.sacar(new BigDecimal("500"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
