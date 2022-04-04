public class Produto {
    private int codProduto;
    private String nome;
    private double preco;
    private String avaliacao;
    private int quantidadeVendida;

    public Produto(int codProduto, String nome, double preco, String avaliacao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.quantidadeVendida = 0;
    }

    public void comprar(int qtdComprada){
        quantidadeVendida += qtdComprada;
    }

    public Double calcularFaturamento(){
        return quantidadeVendida*preco;

    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    @Override
    public String toString() {
        return String.format("%06d %-14s %7.2f %7s %14.3f", this.codProduto, this.nome,this.preco,this.avaliacao,this.calcularFaturamento());
    }

}
