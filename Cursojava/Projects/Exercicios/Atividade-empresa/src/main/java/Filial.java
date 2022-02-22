public abstract class Filial {
    private String pais;

    public  Double calcularLucro(){
        return null;
    };

    public Filial(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "pais='" + pais + '\'' +
                '}';
    }
}
