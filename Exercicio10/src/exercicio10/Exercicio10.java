/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author hahnm
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        livro.setTitulo("Java para Iniciantes");
        livro.setAnoPublicacao(2022);
        livro.setAutor("Carlos Silva");

        Revista revista = new Revista();
        revista.setTitulo("Tecnologia Hoje");
        revista.setAnoPublicacao(2023);
        revista.setEdicao(45);

        System.out.println("Livro: " + livro.getTitulo() + ", Autor: " + livro.getAutor() +
                           ", Ano: " + livro.getAnoPublicacao());
        System.out.println("Revista: " + revista.getTitulo() + ", Edição: " + revista.getEdicao() +
                           ", Ano: " + revista.getAnoPublicacao());

    }
    
}
