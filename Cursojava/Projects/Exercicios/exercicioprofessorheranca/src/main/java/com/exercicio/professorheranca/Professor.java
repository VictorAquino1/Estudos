package com.exercicio.professorheranca;

public class Professor {

    private String nome;
    private Integer codigo;
    private Integer qtdHoras;
    private Double valorHoras;



    public Professor( Integer codigo, String nome, Integer qtdHoras, Double valorHoras) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHoras = valorHoras;
    }

    public Professor() {
    }


    public Double calcularSalario(){
        Double salario = (qtdHoras * valorHoras)*4.5;
        return salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d, Nome: %s, QtdHora: %d, ValorHoras: %.2f",codigo, nome, qtdHoras, valorHoras);
    }

}       
