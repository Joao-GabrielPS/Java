/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1903;

import java.util.Scanner;

/**
 *
 * @author Prado e Souza
 */
public class ePar {
       public static boolean ePar(int x) {
        return x % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Digite um numero inteiro: ");
         int num = entrada.nextInt();
    
         if (ePar(num)) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}
