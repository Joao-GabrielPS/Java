/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1903;

/**
 *
 * @author Prado e Souza
 */
public class CalcularMedia {
     public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    public static void main(String[] args) {
        double media = calcularMedia(6.5, 5.0, 9.5);
        System.out.println("A média é: " + media);
    }
}
