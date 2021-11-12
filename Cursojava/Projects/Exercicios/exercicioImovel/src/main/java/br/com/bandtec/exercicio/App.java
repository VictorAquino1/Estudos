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
public class App {
    public static void main(String[] args) {
         Imovel imovel = new Imovel(1000.00, "Rua 1");
        ImovelNovo imovel1 = new ImovelNovo(1000.00, "Rua 2");
        ImovelUsado imovel2 = new ImovelUsado(1000.00, "Rua 3");
        
        
        System.out.println(imovel.getPrecoVenda());
        System.out.println(imovel1.getPrecoVenda());
        System.out.println(imovel2.getPrecoVenda());
        ;
        
    }
    
    
   
    
   
   
        
    
  
    
   
}
