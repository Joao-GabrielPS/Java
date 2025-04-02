/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1203;

import java.util.Scanner;

/**
 *
 * @author 12409864678
 */
public class MediaNotas {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int valor = 1;
        
        System.out.println("Digite o número de alunos: ");
        int x = entrada.nextInt();
        
        int[] vetor = new int[x];
       
    for(int y=0; y<x; y++){
        System.out.println("Digite a nota do aluno" + valor + ": ");
        int nota = entrada.nextInt(); 
        vetor[y] = nota;
        valor++;
     }
        double soma = vetor[0] + vetor[1] + vetor[2];
         System.out.println("Média: " + soma/x);
         valor++;
    }
}