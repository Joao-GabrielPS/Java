/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author 12409864678
 */
public class Porta {
    boolean aberta = false;
    String cor;
    int dimensaoX, dimensaoY, dimensaoZ;
    
    public void abrir(){
        if(this.aberta == false){
        this.aberta = true;
        }else{
            System.out.println("A porta já está aberta!");
        }
    }
    public void fechar(){
        if(this.aberta == true){
        this.aberta = false;
    }else{
            System.out.println("A porta já está fechada!");
        }
   }
    public void pintar(String s){
        this.cor = s;
        System.out.println("Agora a porta está com a cor "+this.cor);
    }
   public boolean abrida(){
        if(this.aberta == true){
            return(true);
        }else{
            return(false);
        }
    }
}