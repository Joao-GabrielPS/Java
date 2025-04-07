/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_0204;

/**
 *
 * @author 12409864678
 */
public class Aluno {
    String nome;
    int matricula, idade;
    public void exibirDados(){
        System.out.println("O nome do aluno: "+this.nome);
        System.out.println("A matricula do aluno: "+this.matricula);
        System.out.println("A idade do aluno: "+this.idade);
    }
    public void fazerMatricula(){
        System.out.println("O aluno foi matriculado.");
    }
}
