/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author hahnm
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        aviao.setCapacidade(180);
        aviao.setVelocidade(850.0);
        aviao.setCompanhiaAerea("Latam");

        Onibus onibus = new Onibus();
        onibus.setCapacidade(50);
        onibus.setVelocidade(60.0);
        onibus.setNumeroLinha(205);

        System.out.println("Avião: Capacidade " + aviao.getCapacidade() + ", Velocidade " +
                           aviao.getVelocidade() + " km/h, Companhia: " + aviao.getCompanhiaAerea());
        System.out.println("Ônibus: Capacidade " + onibus.getCapacidade() + ", Velocidade " +
                           onibus.getVelocidade() + " km/h, Linha: " + onibus.getNumeroLinha());

    }
    
}
