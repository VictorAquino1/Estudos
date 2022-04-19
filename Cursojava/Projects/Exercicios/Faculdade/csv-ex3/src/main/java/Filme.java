public class Filme {
    private int idFilme;
    private String nome;
    private Double nota;
    private String genero;
    private int idade;

    public Filme(int idFilme, String nome, Double nota, String genero, int idade) {
        this.idFilme = idFilme;
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
        this.idade = idade;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "filme{" +
                "idFilme=" + idFilme +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
