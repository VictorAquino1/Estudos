public class Servico implements Vendavel{
    private String descricao;
    private Integer codigo;
    private Integer qtdeHoras;
    private Double valorHoras;

    public Servico(String descricao, Integer codigo, Integer qtdeHoras, Double valorHoras) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdeHoras = qtdeHoras;
        this.valorHoras = valorHoras;
    }

    @Override
    public Double getValorVenda() {
        return valorHoras*qtdeHoras;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", qtdeHoras=" + qtdeHoras +
                ", valorHoras=" + valorHoras +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(Integer qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }
}
