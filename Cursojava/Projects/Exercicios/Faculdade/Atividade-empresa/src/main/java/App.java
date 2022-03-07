public class App {
    public static void main(String[] args) {
        Empresa em1 = new Empresa("Mc'Donalds");

        Internacional in1 = new Internacional("Estados Unidos", 1000000.00, 20000.00, 5.50);
        Nacional nac1 = new Nacional("Brasil", 500000.00, 10000.00);

        em1.adicionarFilial(in1);
        em1.adicionarFilial(nac1);
        System.out.println(em1.calcularTotal());
        em1.exibeTodos();



    }    


}
