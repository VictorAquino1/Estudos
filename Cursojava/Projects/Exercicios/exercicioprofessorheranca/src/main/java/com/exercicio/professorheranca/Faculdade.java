package com.exercicio.professorheranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Professor> professores; 

    

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<Professor>();
    }


    public void contratarProfessor(Professor p){
        if(this.professores.size() <= this.vagas){
            for (Professor professor : professores) {
                professores.add(professor);
                System.out.println(professor.getNome());
            }
        }
    }

    public void exibirProfessores() {

        if (this.professores.isEmpty()) {
            System.out.println("Não há professores contratados");
        } else {
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }
    }


  
    @Override
    public String toString() {
        return String.format("Nome: %s, Vagas: %d", nome, vagas);
        
    }

}
