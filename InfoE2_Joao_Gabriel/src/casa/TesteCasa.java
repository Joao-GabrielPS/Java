/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author 12409864678
 */
public class TesteCasa {
     public static void main(String[] args) {
        
        Porta port = new Porta();
        Pessoa pes = new Pessoa();
        Casa casinha = new Casa();
        
     //Pessoa
     pes.nome = "Iago";
     pes.idade = 16;
     pes.fazAniversario();
     
     System.out.println("Pessoa: "+pes.nome+"\nIdade: "+pes.idade+"\n");
     
     //Porta
        System.out.println("A porta está "+port.abrida());
        port.pintar("rosa");
        port.abrir();
        System.out.println("A porta está aberta"+port.abrida());
        port.fechar();
        System.out.println("A porta está aberta "+port.abrida()+"\n");
        
    //Casa
    casinha.porta1.abrir();
    casinha.porta2.fechar();
    casinha.porta3.fechar();
    casinha.quantasEstaoAbertas();
    
    casinha.pintar("verde");
    
    
    }
}