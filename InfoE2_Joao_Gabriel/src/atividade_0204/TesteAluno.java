/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_0204;

import java.util.Scanner;

/**
 *
 * @author 12409864678
 */
public class TesteAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
       
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        System.out.println("Digite o nome do Aluno1: ");
        a1.nome = entrada.nextLine();
        System.out.println("Digite a matricula: ");
        a1.matricula = entrada.nextInt();
        System.out.println("Digite sua idade: ");
        a1.idade = entrada.nextInt();
        
        System.out.println("Digite o nome do Aluno2: ");
        a2.nome = entrada2.nextLine();
        System.out.println("Digite sua matricula: ");
        a2.matricula = entrada2.nextInt();
        System.out.println("Digite sua idade: ");
        a2.idade = entrada2.nextInt();
        
        a1.fazerMatricula();
        a1.exibirDados();
        
        a2.fazerMatricula();
        a2.exibirDados();
    }
}