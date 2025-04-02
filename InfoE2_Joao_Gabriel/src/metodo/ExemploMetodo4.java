/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

/**
 *
 * @author 12409864678
 */
public class ExemploMetodo4 {
    //Exemplo mtodo com return e com passagem de parâmetros
    
    public static int somar (int a, int b) {
        return a + b;
    }
    public static void main(String [] args) {
        int resultado = somar (30, 20);
        System.out.println("Soma1: "+somar (60, 70));
        System.out.println("Soma2: "+resultado);
    }
}