package com.exercicio.remuneracao;

public class Desenvolvedor {
    private String nome;
    private Integer qtdHorasTrabalhadas;
    private Double valorHoraTrabalhada;

    public Desenvolvedor(){}

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }
    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }
    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }
    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getSalario(){
        Double salario = valorHoraTrabalhada * qtdHorasTrabalhadas;

        return salario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, qtdHoras: %d, valorHora: %.2f, salario: %.2f", nome, qtdHorasTrabalhadas, valorHoraTrabalhada, getSalario());
    }


}
