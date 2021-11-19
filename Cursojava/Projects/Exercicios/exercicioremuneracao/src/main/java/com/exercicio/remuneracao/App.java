package com.exercicio.remuneracao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Consultoria cons1 = new Consultoria("Bandtec", 3);
       Consultoria cons2 = new Consultoria("Dvi", 6);
       Consultoria cons3 = new Consultoria("Pdr", 10);
       
        Desenvolvedor dev1 = new Desenvolvedor("Davi", 10, 2.0);

        cons1.contratar(dev1);

        System.out.println(cons1.getQuantidadeDesenvolvedor());
        

        System.out.println(cons1.buscarDesenvolvedorPorNome(dev1.getNome()));
    }
}
