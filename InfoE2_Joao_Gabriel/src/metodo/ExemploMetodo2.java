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
public class ExemploMetodo2 {
    
    public static int somar(){ //Método com retorno int
        int a=20, b=30;
        return a+b;
    }
    
    public static void main(String[] args) {
        int resultado = somar();
        resultado = resultado+10;
        System.out.println("Resultado: "+resultado);
        System.out.println("Resultado: "+somar());
    }
}