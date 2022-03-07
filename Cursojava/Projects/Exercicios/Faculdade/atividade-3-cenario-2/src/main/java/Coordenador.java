public class Coordenador extends Professor{
    private Integer qtdHorasCoord;
    private Integer valorHorasCoord;

    @Override
    public Double getValorBonus() {
        return (super.getQtdAulasSem()*super.getValorAula()*4.5*0.15)+(qtdHorasCoord*valorHorasCoord*4.5*0.2);
    }

    public Coordenador(String nome, Integer qtdAulasSem, Double valorAula, Integer qtdHorasCoord, Integer valorHorasCoord) {
        super(nome, qtdAulasSem, valorAula);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHorasCoord = valorHorasCoord;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHorasCoord=" + qtdHorasCoord +
                ", valorHorasCoord=" + valorHorasCoord +
                "} " + super.toString();
    }
}
