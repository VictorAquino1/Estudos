package com.exercicio.professorheranca;

public class Coordenador extends Professor{
    
    private Integer qtdHorasCoord;
    private Double valorHorasCoord;
    private String curso;

    @Override
    public Double calcularSalario(){
        Double salario = ((super.getQtdHoras() * super.getValorHoras())*4.5)+((qtdHorasCoord*valorHorasCoord)*4.5);
        return salario;

    }

    public Coordenador( Integer codigo, String nome, Integer qtdHoras, Double valorHoras, Integer qtdHorasCoord, Double valorHoraCoord, String curso) {
        super(codigo, nome, qtdHoras, valorHoras);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHorasCoord = valorHoraCoord;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d, Nome: %s, QtdHora: %d, ValorHoras: %.2f, qtdHorasCoord: %d, valorHoras: .2f",super.getCodigo(), super.getNome(), super.getQtdHoras(), super.getValorHoras(), valorHorasCoord, qtdHorasCoord);
        
    }

    

}
