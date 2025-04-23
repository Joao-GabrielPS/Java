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
public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionarios objFuncionarios = new Funcionarios();
        Funcionarios objFuncionarios2 = new Funcionarios();
        objFuncionarios.nome="João Souza";
        objFuncionarios.dataEntrada="20/02/2024";
        objFuncionarios.departamento="Ti";
        objFuncionarios.rg="Mg12409864678";
        objFuncionarios.salario=1500;
        
        System.out.println("Nome: "+objFuncionarios.nome);
        System.out.println("RG: "+objFuncionarios.rg);
        System.out.println("dataEntrada: "+objFuncionarios.dataEntrada);
        System.out.println("Departamento: "+objFuncionarios.departamento);
        System.out.println("Salario: "+objFuncionarios.salario);
        
        objFuncionarios.mostra();
        }
        
    }
