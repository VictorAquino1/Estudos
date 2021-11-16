package com.exercicio.exerciciovetor;

public class Aluno {
    private String name;
    private String email;
    private int numQuarto;
    private Double aluguel;

    public Aluno(String name, String email, int numQuarto) {
        this.name = name;
        this.email = email;
        this.numQuarto = numQuarto;
    }

    public Aluno() {
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Double getAluguel() {
        return aluguel;
    }

    public void setAluguel(Double aluguel) {
        this.aluguel = aluguel;
    }


    

    @Override
    public String toString() {
        return String.format("%d: %s, %s", numQuarto, name, email);
    }
}
