package sptech.projeto02;

public class Pais {
    private String nome;
    private int medalhasOuro;
    private int medalhasPrata;
    private int medalhasBronze;

    public Pais(String nome, int medalhasOuro, int medalhasPrata, int medalhasBronze) {
        this.nome = nome;
        this.medalhasOuro = medalhasOuro;
        this.medalhasPrata = medalhasPrata;
        this.medalhasBronze = medalhasBronze;
    }
    public Pais() {

    }

    public int getTotalMedalhas(){
        return this.medalhasOuro + this.medalhasPrata + this.medalhasBronze;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMedalhasOuro() {
        return medalhasOuro;
    }

    public void setMedalhasOuro(int medalhasOuro) {
        this.medalhasOuro = medalhasOuro;
    }

    public int getMedalhasPrata() {
        return medalhasPrata;
    }

    public void setMedalhasPrata(int medalhasPrata) {
        this.medalhasPrata = medalhasPrata;
    }

    public int getMedalhasBronze() {
        return medalhasBronze;
    }

    public void setMedalhasBronze(int medalhasBronze) {
        this.medalhasBronze = medalhasBronze;
    }
}
