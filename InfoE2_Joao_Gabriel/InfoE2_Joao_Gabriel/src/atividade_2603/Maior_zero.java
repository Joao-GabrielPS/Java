/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2603;

import java.util.Scanner;

/**
 *
 * @author 12409864678
 */
public class Maior_zero {
 public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int num, x=0;
while(true){
System.out.println("Digite apenas Número acima de 0: ");
num = entrada.nextInt();
if (num > 0){

System.out.println("Número Valido. Tente outro número:");
break;
}

}
while( num >= 0){
num--;
System.out.println(""+num);
}
}
}