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
public class AnaliseFrase {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        
        int tam = frase.length();
                
        System.out.println("O tamanho da frase é: " + frase.length());
        System.out.println("Frase em maiusculo: " + frase.toUpperCase());
        System.out.println("Frase em minusculo: " + frase.toLowerCase());
        System.out.println("Frase primeira letra: " + frase.charAt(0));
        System.out.println("Frase ultima letra: " + frase.charAt(tam - 1));
        
        System.out.println("Digite uma palavra: ");
        String palav = entrada.nextLine();
        
        System.out.println("Contem a palavra na frase: " + palav.contains(frase));
    }
}

