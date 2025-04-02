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
public class ExemploMetodo3 {
    
    public static void exibirNome (String nome, String sobrenome, double salario){
        System.out.println("=====RELATÓRIO=====");
        System.out.println("Nome: "+nome);
        System.out.println("sobreNome: "+sobrenome);
        System.out.printf("Salário: %.2f\n",salario);
        System.out.println("======================");
    }
    
    public static void main(String[] args) {
        exibirNome("João Gabriel", "Prado de Souza", 4000.9432);
        exibirNome("Iago", "Diniz", 3000.8586);
    }
}
