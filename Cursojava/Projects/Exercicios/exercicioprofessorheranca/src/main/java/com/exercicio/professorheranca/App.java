package com.exercicio.professorheranca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
     
        Professor p1 = new Professor(555, "Paulo", 12, 20.0);
        Professor p2 = new Professor(222, "Vivian", 18, 25.0);
        
        Coordenador c1 = new Coordenador(42, "Marise", 20, 25.0, 15, 30.0, "CCO");
        
        Faculdade faculdade = new Faculdade("Bandtec", 2);
        
        faculdade.contratarProfessor(p2);
        faculdade.contratarProfessor(c1);
        
        System.out.println("Exibindo todos os professores....\n");
        faculdade.exibirProfessores();
        
        System.out.println("Exibindo todos os coordenadores....\n");

        
        
        faculdade.contratarProfessor(p1);
        
        System.out.println("Dados da faculdade:");
        System.out.println(faculdade);
    }
}
