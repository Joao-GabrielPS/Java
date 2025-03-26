/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;
import java.lang.System;
/**
 *
 * @author 12409864678
 */
public class EntradaSaidaPadrao {
    public static void main (String arg[]){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String nome = entrada.nextLine();
    System.out.println("Digite sua idade");
    int idade = entrada.nextInt();
    idade++;
    System.out.println("Digite eu salário:");
    double salario = entrada.nextDouble();
    
    System.out.println("Nome: "+nome); //saida padrão
    System.out.println("Idade: "+idade);  //saida padrão
    System.out.println("Idade: "+salario);  //saida padrão
         
    }
}
