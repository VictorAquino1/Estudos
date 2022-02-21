public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
