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
public class celsiusParaFahrenheit {
        public static void main(String[] args) {
       ConversorTemperatura obj = new ConversorTemperatura(); 
       
       System.out.println("Celsius para Farenheit:"+obj.celsiusParaFahrenheit(25));
       System.out.println("Farenheit para Celsius:"+obj.fahrenheitParaCelsius(67.4));
    }

}
