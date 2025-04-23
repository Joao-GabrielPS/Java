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
public class Funcionarios {
    String nome, departamento, dataEntrada, rg;
    double salario;
    boolean ativo=true;
    
    public void bonifica(double aumento){
    this.salario = this.salario + aumento;
    }
    void demite(){
        this.ativo = false;
    }
   public void mostra(){

}
}
