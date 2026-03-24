/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author hahnm
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setModelo("Fiesta");
        carro.setAno(2020);
        carro.setNumeroPortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB500");
        moto.setAno(2021);
        moto.setCilindradas(500);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() +
                           ", Ano: " + carro.getAno() + ", Portas: " + carro.getNumeroPortas());
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo() +
                           ", Ano: " + moto.getAno() + ", Cilindradas: " + moto.getCilindradas());

    }
    
}
