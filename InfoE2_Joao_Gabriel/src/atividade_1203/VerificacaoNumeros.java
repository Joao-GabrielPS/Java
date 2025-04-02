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
public class VerificacaoNumeros {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite primeiro número inteiro");
        int n1 = entrada.nextInt();
                
        System.out.println("Digite o secundo número inteiro");
        int n2 = entrada.nextInt();
               
        System.out.println("Digite terceiro número inteiro");
        int n3 = entrada.nextInt();
        
        int maior = n1;
        if(n2 > maior){
           maior = n2;
        }
        if(n3 > maior){
            maior = n3;
        }
        
        System.out.println("Maior número: " + maior);
        
        verificaNumero(n1);
        verificaNumero(n2);
        verificaNumero(n3);
    }

    public static void verificaNumero(int n) {
        if (n > 0) {
            System.out.println(n + " é positivo.");
        } 
        else if (n < 0) {
            System.out.println(n + " é negativo.");
        } 
        else {
            System.out.println(n + " é igual a zero.");
        }
    }
}