/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2603;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author 12409864678
 */
public class PotenciaRaiz {
    public static double calcularQuadrada(double numero){
        return Math.pow(numero, 2);
}
    
     public static double calcularRaizQuadrada(double numero){
        return Math.sqrt(numero);
     }
     
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        double numero = entrada.nextDouble();
        System.out.println("O Quadrado de " +numero+ "é: "+calcularQuadrada(numero));
        System.out.println("O Quadrado de " +numero+ "é: "+calcularRaizQuadrada(numero));
    }
    }