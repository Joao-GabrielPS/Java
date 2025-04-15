/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contasPagas;

/**
 *
 * @author 12409864678
 */
public class Conta {
    int idConta;
    String dataVencimento, dataPagamento;
    
    Produto pro = new Produto();
    Cliente cli = new Cliente();
    
        public void vizualizarConta(){
        System.out.println("Identificador da conta: "+this.idConta+
                " \nNome do produto: "+this.pro.descricao+
                " \nNome do cliente: "+this.cli.cpf+" CPF: "+this.cli.cpf+
                " \nValor do produto: "+this.pro.valor+
                " \nData do vencimento: "+this.dataVencimento+
                " \nData do pagamento: "+this.dataPagamento+"\n");
    }
}
