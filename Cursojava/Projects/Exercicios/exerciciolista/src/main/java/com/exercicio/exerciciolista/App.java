package com.exercicio.exerciciolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        

        System.out.println("How many employees will be registered? ");
        Integer num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Emplyoee # "+ i);
            System.out.println("Id");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome");
            String nome = sc.nextLine();
            System.out.println("Salario");
            Double salario = sc.nextDouble();
            
            lista.add(new Funcionario(id,nome,salario));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId() != id){
                System.out.println("Abortar missão");
            }
        }

        System.out.println("Enter the percentage: ");
        Integer percentage = sc.nextInt();

        
        
    }

}
