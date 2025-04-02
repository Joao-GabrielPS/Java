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
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora objCalc = new Calculadora();//Objeto ou instância de uma classe
        Calculadora objCalc2 = new Calculadora();//Objeto ou instância de uma classe
        
        System.out.println("Resultado da multiplicação: "+objCalc.multiplicar(2, 20));
        System.out.println("Resultado da divisão: "+objCalc2.dividir(100, 3));
    }
}
