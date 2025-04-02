/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2603;

/**
 *
 * @author 12409864678
 */
public class Produto {
     String nome;
    double preco, porcentagemDesconto, valPagar;
    
    public void exibirInformacoes(){
                System.out.println("Nome do produto: " + nome);
                System.out.println("Preço do produto: " + preco);
                System.out.println("Valor a pagar com "+porcentagemDesconto+"% : " + valPagar);
    }
    public void calcularPrecoPromocional(){
        valPagar = preco - (preco*(porcentagemDesconto/100));
    }
}
