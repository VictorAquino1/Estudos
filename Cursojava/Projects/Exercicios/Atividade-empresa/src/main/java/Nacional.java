public class Nacional extends Filial{
    private Double vendas;
    private Double despeza;

    @Override
    public Double calcularLucro() {
        return vendas-despeza;
    }

    public Nacional(String pais) {
        super(pais);
    }
}
