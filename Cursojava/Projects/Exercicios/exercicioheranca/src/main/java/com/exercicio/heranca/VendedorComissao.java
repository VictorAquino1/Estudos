package com.exercicio.heranca;

public class VendedorComissao {
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }
    public VendedorComissao(){
    
    }
    
    
    public Double calcularSalario(){
    Double valorSalario = vendas *(taxa/100);
        
    return valorSalario;
    }


}
