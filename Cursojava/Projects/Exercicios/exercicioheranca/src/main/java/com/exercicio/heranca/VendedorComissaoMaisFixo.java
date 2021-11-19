package com.exercicio.heranca;

public class VendedorComissaoMaisFixo extends VendedorComissao{
    private Double salarioFixo;
    
    @Override
    public Double calcularSalario(){
        Double valorTaxa = super.calcularSalario();
       
        Double fixo = this.salarioFixo;
        
        Double valorFinal = valorTaxa + fixo;
    
        return valorFinal;
    }

    public VendedorComissaoMaisFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public VendedorComissaoMaisFixo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
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
