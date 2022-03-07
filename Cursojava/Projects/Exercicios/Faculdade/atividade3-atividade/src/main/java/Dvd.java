public class Dvd extends Produto{
    private String gravador;

    public Dvd(Integer codigo, String nome, Double precoCusto, String gravador) {
        super(codigo, nome, precoCusto);
        this.gravador = gravador;
    }

    public Double getValorVenda(){
        return super.getPrecoCusto()*1.20;

    }

    @Override
    public String toString() {
        return "Dvd{" +
                "gravador='" + gravador + '\'' +
                "} " + super.toString();
    }
}
