/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

/**
 *
 * @author hahnm
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S23");
        celular.setMemoria(128);

        Notebook notebook = new Notebook();
        notebook.setMarca("Dell");
        notebook.setModelo("Inspiron 15");
        notebook.setProcessador("Intel i7");

        System.out.println("Celular: " + celular.getMarca() + " " + celular.getModelo() +
                           ", Memória: " + celular.getMemoria() + "GB");
        System.out.println("Notebook: " + notebook.getMarca() + " " + notebook.getModelo() +
                           ", Processador: " + notebook.getProcessador());
    }

    }
    

