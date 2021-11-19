package com.exercicio.remuneracao;



public class Consultoria {

    private String nome;
    private Integer vagas;
    private Desenvolvedor devs[] = new Desenvolvedor[10];
    

   

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
    }

    public Boolean existePorNome(String nome){
        Boolean exist = true;
        for (Desenvolvedor desenvolvedor : devs) {
            if(desenvolvedor.getNome().equals(nome)){
                exist = true;

            }
        }
        return exist;
    }

    public void contratar(Desenvolvedor desenvolvedor){
        if(vagas<=0){
            System.out.println("Sem vagas disponiveis!");
        }else{

            for (int i = 0; i < devs.length; i++) {
                devs[i] = desenvolvedor;
                
            }
            vagas--;
        }
    }

    public Integer getQuantidadeDesenvolvedor(){
        Integer tamanho = 0;
        for (int i = 0; i < devs.length; i++) {
            tamanho++;
        }
        return tamanho;
    }

    public Integer getQuantidadeDesenvolvedorMobile(){
        
        return null;
    }

    public Double getTotalSalarios(){
        Double salario = 0.0;
        for (Desenvolvedor desenvolvedor : devs) {
            salario += desenvolvedor.getSalario();
        }
        return salario;
    }

    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){

        Desenvolvedor dev9 = new Desenvolvedor();
        for (int i = 0; i < devs.length; i++) {
            if(nome.equals(devs[i].getNome())){
                dev9 = devs[i];
            }else{
                dev9 = null;
            }
        }
        return dev9;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, vagas: %d", nome, vagas);
    }

}
