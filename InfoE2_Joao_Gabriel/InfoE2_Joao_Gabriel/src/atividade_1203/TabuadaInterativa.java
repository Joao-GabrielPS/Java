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
public class TabuadaInterativa {
       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int x = entrada.nextInt();
        
        int resultado = 0;
    for(int i=1; i<=10;i++){
        resultado = x * i;
        System.out.println(x + " * " + i + " = " + resultado);
    }
    }
}