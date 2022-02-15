public abstract class Produto implements Vendavel{

    private Integer codigo;
    private String nome;
    private Double precoCusto;

    public Produto(Integer codigo, String nome, Double precoCusto) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    @Override
    public Double getValorVenda() {
        return precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", precoCusto=" + precoCusto +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
