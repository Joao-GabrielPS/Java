/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2603;

import java.util.Scanner;

/**
 *
 * @author 12409864678
 */
public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = entrada.nextInt();
        int soma =0;

        for (int n1=0; n1<=num; n1+=2 ){
            System.out.println(n1);
            soma+=n1;
        }
        System.out.println("A soma dos número: "+soma);
    }
}