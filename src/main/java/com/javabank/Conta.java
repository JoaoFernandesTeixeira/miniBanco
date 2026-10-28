package com.javabank;

import java.math.BigDecimal;

public class Conta {

    private final String titular;
    private BigDecimal saldo;

    public Conta(String titular){
        this.titular = titular;
        this.saldo = BigDecimal.ZERO;
    }

    public String getTitular(){
        return  titular;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    public void depositar(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero");
        }
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero");
        }
        if (valor.compareTo(saldo) > 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }
}
