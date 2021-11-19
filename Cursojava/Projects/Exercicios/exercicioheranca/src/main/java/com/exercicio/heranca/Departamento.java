package com.exercicio.heranca;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends VendedorComissao{
    
    protected List<VendedorComissao> vendedor = new ArrayList<VendedorComissao>();
    
    
   

    public Departamento() {
    }

    
    

    public void adicionaVendedor(VendedorComissao vendedorComissao){
        vendedor.add(vendedorComissao);
    }

    public Double calcularTotalSalario(){
        Double totalSalario = 0.0;
        for (int i = 0; i < vendedor.size(); i++) {
            totalSalario += calcularSalario();
            
        }
        return totalSalario;
    }

    public void exibeTodos(){
        for (VendedorComissao vendedorComissao : vendedor) {
            System.out.println("=================");

                System.out.println("Nome: "+ vendedorComissao.getNome());

                System.out.println("Vendas: "+ vendedorComissao.getVendas());

                System.out.println("Taxa: "+ vendedorComissao.getTaxa());

            System.out.println("=================");
        }
    }




    @Override
    public String toString() {
        return "Departamento [vendedor=" + vendedor + "]";
    }

}
