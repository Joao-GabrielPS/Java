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
public class testeAritmetica {
        public static void main(String[] args) {
      Aritmetica obj = new Aritmetica();  
      
      System.out.println("Resultado da Multiplicação:"+obj.multiplicar(11, 23));
      System.out.println("Resultado da Divisão:"+obj.dividir(50, 10));
      System.out.println("Resultado da Soma:"+obj.somar(16,32));
      System.out.println("Resultado da Subtração:"+obj.subtrair(45, 15));
      System.out.println("Resultado do resto de Divisão:"+obj.resto(20, 4));
    }

}
