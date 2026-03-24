/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author hahnm
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProdutoEletronico tv = new ProdutoEletronico();
        tv.setNome("Smart TV");
        tv.setPreco(2500.0);
        tv.setVoltagem(220);

        ProdutoAlimento leite = new ProdutoAlimento();
        leite.setNome("Leite Integral");
        leite.setPreco(6.5);
        leite.setDataValidade("2026-03-20");

        System.out.println("Produto Eletrônico: " + tv.getNome() + ", Preço: " + tv.getPreco() +
                           ", Voltagem: " + tv.getVoltagem() + "V");
        System.out.println("Produto Alimentício: " + leite.getNome() + ", Preço: " + leite.getPreco() +
                           ", Validade: " + leite.getDataValidade());
    }
    
}
