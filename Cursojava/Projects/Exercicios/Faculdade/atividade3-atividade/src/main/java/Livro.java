public class Livro extends Produto{

    private String livro;
    private String isbn;

    public Livro(Integer codigo, String nome, Double precoCusto, String autorLivro, String isbn) {
        super(codigo, nome, precoCusto);
        this.livro = livro;
        this.isbn = isbn;
    }

    public Double getValorVenda(){
        return super.getPrecoCusto()*1.10;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "livro='" + livro + '\'' +
                ", isbn='" + isbn + '\'' +
                ", Valor de venda='" + getValorVenda() + '\'' +
                "} " + super.toString();
    }

    public String getLivro() {

        return livro;
    }

    public void setLivro(String livro) {

        this.livro = livro;
    }

    public String getIsbn() {

        return isbn;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }
}
