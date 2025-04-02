/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 12409864678
 */
public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(); //Criei um objeto
        Conta outraConta = new Conta(); //Criei um objeto
        
        minhaConta.saldo = 10000;
        outraConta.saldo = 20000;
        minhaConta.saca(50000);
        
        System.out.println("Saldo da minha conta: "+minhaConta.saldo);
        System.out.println("Saldo da outra conta: "+outraConta.saldo);
        
        System.out.println("Endereço da minha conta: "+minhaConta);
        System.out.println("Endereço da outra conta: "+outraConta);
    }
}
