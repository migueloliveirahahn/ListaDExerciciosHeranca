/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author hahnm
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setIdade(3);

        Gato gato = new Gato();
        gato.setNome("Mimi");
        gato.setIdade(2);

        System.out.println(cachorro.getNome() + " diz:");
        cachorro.emitirSom();

        System.out.println(gato.getNome() + " diz:");
        gato.emitirSom();

    }
    
}
