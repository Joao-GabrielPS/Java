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
public class Conta {
    int numero; //atributos ou variáveis de instância
    String cliente;
    double saldo;
    double limite;
    double transfere;
    
    public void saca (double quantidade) { //método
        if(quantidade > this.saldo){
        System.out.println("Prezado "+this.cliente+" .SaldoInsuficiente. Seu saldo é: "+this.saldo);
        }
        else{
        this.saldo = this.saldo - quantidade;
        }
        }
    public void deposita (double quantidade){
        this.saldo = this.saldo + quantidade;
    }
    
    public void transfere (Conta destino, double valor ){
        if(valor>this.saldo){
        this.saldo = this.saldo - valor;
        System.out.println("Saldo insuficiente para transferência");
    }else{
    //destino.saldo = destino.saldo - valor // saque
    this.saldo = this.saldo - valor;
    //destino.saldo = destino.saldo + valor // deposito
    destino.deposita(valor);
}
    }
}