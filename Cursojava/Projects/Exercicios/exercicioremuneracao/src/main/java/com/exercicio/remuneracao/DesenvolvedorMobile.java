package com.exercicio.remuneracao;

public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHoraTrabalhadaMobile;
    private Double valorHoraTrabalhadaMobile;


    public DesenvolvedorMobile() {
    }

   
    public DesenvolvedorMobile(String nome, Integer qtdHoraTrabalhadaMobile, Double valorHoraTrabalhadaMobile) {
        super(nome, qtdHoraTrabalhadaMobile, valorHoraTrabalhadaMobile);
        this.qtdHoraTrabalhadaMobile = qtdHoraTrabalhadaMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }













    @Override
    public Double getSalario(){
        Double salario = super.getValorHoraTrabalhada() * super.getQtdHorasTrabalhadas();
        Double salarioMobile = valorHoraTrabalhadaMobile * qtdHoraTrabalhadaMobile;
        Double salarioTotal = salario + salarioMobile;

        
        return salarioTotal;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, qtdHoras: %d, valorHora: %.2f, salario: %.2f", super.getNome(), qtdHoraTrabalhadaMobile, valorHoraTrabalhadaMobile, getSalario());
    }


}
