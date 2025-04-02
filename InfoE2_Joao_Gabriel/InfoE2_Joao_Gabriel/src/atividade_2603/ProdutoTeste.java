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
public class ProdutoTeste {
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
        
        ProdutoTeste obj = new ProdutoTeste();
        
        System.out.println("Digite o produto: ");
        obj.nome = entrada.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        obj.preco = entrada.nextDouble();
        
        System.out.println("Digite o desconto do produto: ");
        obj.porcentagemDesconto = entrada.nextDouble();
        
        obj.calcularPrecoPromocional();
        obj.exibirInformacoes();
 
    }
    private double preco;
    private double porcentagemDesconto;
    private String nome;

    private void calcularPrecoPromocional() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void exibirInformacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}