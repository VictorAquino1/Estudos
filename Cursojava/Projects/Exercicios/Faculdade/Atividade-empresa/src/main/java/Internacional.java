public class Internacional extends Filial{
    private Double vendas;
    private Double despezas;
    private Double dolar = 5.90;

    public Internacional(String pais, Double vendas, Double despezas, Double dolas) {
        super(pais);
        this.vendas = vendas;
        this.despezas = despezas;
        this.dolar = dolas;
    }

    @Override
    public Double calcularLucro() {
        return (vendas-despezas)/dolar;
    }
}
