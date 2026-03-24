/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author hahnm
 */
public class ContaBancaria {
      private String numeroConta;
    private double saldo;

    public ContaBancaria() {}

    public String getNumeroConta() { return numeroConta; }
    public void setNumeroConta(String numeroConta) { this.numeroConta = numeroConta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
}

class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente() {}

    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }
}
