package com.exercicio.heranca;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Departamento departo = new Departamento();
        VendedorComissao salario1 = new VendedorComissao(123, "Davi", 1000.00, 10.00);
        VendedorComissao salario2 = new VendedorComissao(123, "Vinicius", 2000.00, 10.00);
        VendedorComissao salario3 = new VendedorComissao(123, "Pedro", 3000.00, 10.00);

        VendedorComissaoMaisFixo salario4 = new VendedorComissaoMaisFixo(1000.00, 123, "Davi", 1000.00, 10.00);
        
        
       
        departo.adicionaVendedor(salario1);
        departo.adicionaVendedor(salario2);
        departo.adicionaVendedor(salario3);
       departo.calcularTotalSalario();
        departo.exibeTodos();
        
    }
}
