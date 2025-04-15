/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contasPagas;

/**
 *
 * @author 12409864678
 */
public class Programa {
      public static void main(String[] args) {
        
        Conta continha = new Conta();
        Conta continha2 = new Conta();
        
        continha.idConta = 1;
        continha.pro.descricao = "NoteBook core 17";
        continha.pro.valor = 1200;
        continha.cli.nomeCliente = "Iago";
        continha.cli.cpf = "134.102.896-82";
        continha.dataVencimento = "08/07/25";
        continha.dataPagamento = "03/07/25";
        
        continha.vizualizarConta();
        
        System.out.println("----------------------------------------------------");
        
        continha2.idConta = 2;
        continha2.pro.descricao = "NoteBook core 23";
        continha2.pro.valor = 1400;
        continha2.cli.nomeCliente = "Joao";
        continha2.cli.cpf = "154.191.896-42";
        continha2.dataVencimento = "08/08/25";
        continha2.dataPagamento = "15/08/25";
        
        continha2.vizualizarConta();
        
              
    }
}
