/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author hahnm
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Professor professor = new Professor();
        professor.setNome("Dr. Silva");
        professor.setCpf("123.456.789-00");
        professor.setDisciplina("Matemática");

        Aluno aluno = new Aluno();
        aluno.setNome("Carlos");
        aluno.setCpf("987.654.321-00");
        aluno.setMatricula("2023002");

        System.out.println("Professor: " + professor.getNome() + ", CPF: " + professor.getCpf() +
                           ", Disciplina: " + professor.getDisciplina());
        System.out.println("Aluno: " + aluno.getNome() + ", CPF: " + aluno.getCpf() +
                           ", Matrícula: " + aluno.getMatricula());
    }
    
}
