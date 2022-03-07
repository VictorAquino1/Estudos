public class Professor extends Educadores{

    private Integer qtdAulasSem;
    private Double valorAula;

    public Integer getQtdAulasSem() {
        return qtdAulasSem;
    }

    public void setQtdAulasSem(Integer qtdAulasSem) {
        this.qtdAulasSem = qtdAulasSem;
    }

    public Double getValorAula() {
        return valorAula;
    }

    public void setValorAula(Double valorAula) {
        this.valorAula = valorAula;
    }

    @Override
    public Double getValorBonus() {
        Double bonus = getQtdAulasSem()*getValorAula()*4.5*0.15;
        return bonus;
    }

    public Professor(String nome, Integer qtdAulasSem, Double valorAula) {
        super(nome);
        this.qtdAulasSem = qtdAulasSem;
        this.valorAula = valorAula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qtdAulasSem=" + qtdAulasSem +
                ", valorAula=" + valorAula +
                "} " + super.toString();
    }
}
