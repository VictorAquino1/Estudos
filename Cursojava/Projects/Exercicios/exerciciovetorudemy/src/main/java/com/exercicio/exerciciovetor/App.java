package com.exercicio.exerciciovetor;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many rooms will be rented");
        Integer numAlunos = sc.nextInt();
        Aluno[] quarto = new Aluno[10];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Rent #" + i+1 +" : ");
            sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Room:");
            Integer numQuarto = sc.nextInt();

            quarto[i] = new Aluno(name, email, numQuarto);
        }

        System.out.println("Busy rooms: ");
       
         for (int i = 0; i < numAlunos; i++) {
              String nome = quarto[i].getName();
              String email = quarto[i].getEmail();
              int quarto1 = quarto[i].getNumQuarto();
              
              System.out.println(String.format("%d: %s , %s", quarto1, nome, email));
         }
    }
}
