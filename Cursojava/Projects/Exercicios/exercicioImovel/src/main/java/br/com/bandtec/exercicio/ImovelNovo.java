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
public class ImovelNovo extends Imovel {

    public ImovelNovo(Double preco, String endereco) {
        super(preco, endereco);
    }

    public ImovelNovo() {
    }

    
    @Override
    public Double getPrecoVenda(){
        Double precoVenda = super.getPrecoVenda();
        Double valor = precoVenda*1.10;
        return valor;
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEndereco() {
        return super.getEndereco(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPreco(Double preco) {
        super.setPreco(preco); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
