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
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca() {}

    public double getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(double taxaRendimento) { this.taxaRendimento = taxaRendimento; }

}
