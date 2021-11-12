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
public class VendedorComissaoMaisFIxo extends VendedorComissao {
    private Double salarioFixo;
    
    @Override
    public Double calcularSalario(){
        Double valorTaxa = super.calcularSalario();
       
        Double fixo = this.salarioFixo;
        
        Double valorFinal = valorTaxa + fixo;
    
        return valorFinal;
    }

    public VendedorComissaoMaisFIxo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public VendedorComissaoMaisFIxo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

   

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

   
        
}
