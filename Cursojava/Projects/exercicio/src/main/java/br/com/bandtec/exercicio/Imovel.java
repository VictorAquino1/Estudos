/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exercicio;

/**
 *
 * @author aluno
 */
public class Imovel {
    private Double preco;
    private String endereco;
    
    public Imovel(Double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }
    
    public Imovel(){
 
    }
    
    public Double getPrecoVenda() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
