/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author 12409864678
 */
public class Casa {      
    String corCasa;
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();
        
        
        public void quantasEstaoAbertas(){
            int quant = 0;
            if(porta1.aberta == true){
                quant += 1;
            }
            if(porta2.aberta == true){
                quant += 1;
            }
            if(porta3.aberta == true){
                quant += 1;
            }
            System.out.println("Estão abertas "+quant+" portas");
        }
        public void pintar(String s){
            this.corCasa = s;
            System.out.println("Agora a porta está com a cor "+this.corCasa);
        }

}    
