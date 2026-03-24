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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumeroConta("001-12345");
        cc.setSaldo(1500.0);
        cc.setLimite(500.0);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumeroConta("002-67890");
        cp.setSaldo(3000.0);
        cp.setTaxaRendimento(0.02);

        System.out.println("Conta Corrente: " + cc.getNumeroConta() + ", Saldo: " + cc.getSaldo() +
                           ", Limite: " + cc.getLimite());
        System.out.println("Conta Poupança: " + cp.getNumeroConta() + ", Saldo: " + cp.getSaldo() +
                           ", Taxa de Rendimento: " + cp.getTaxaRendimento());

    }
    
}
