/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exerciciovendedor;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        
        VendedorComissao salario1 = new VendedorComissao(123, "Davi", 1000.00, 10.00);
        VendedorComissaoMaisFIxo salario2 = new VendedorComissaoMaisFIxo(1000.00, 123, "Davi", 1000.00, 10.00);
        
        System.out.println(salario1.calcularSalario());
        System.out.println(salario2.calcularSalario());
        
    }
}
