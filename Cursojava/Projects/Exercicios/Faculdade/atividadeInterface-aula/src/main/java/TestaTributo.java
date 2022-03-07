public class TestaTributo {
    public static void main(String[] args) {
        Alimento al1 = new Alimento(123, "Gelado", 30.00, 20);
        Perfume pf1 = new Perfume(45,"Channel", 200.0, "coco");
        Servico sv1 = new Servico("Terceirizado", 500.00);
        Tributo  tb1 = new Tributo();

        tb1.adicionaTributavel(al1);
        tb1.adicionaTributavel(pf1);
        tb1.adicionaTributavel(sv1);

        System.out.println(tb1.calculaTotalTributo());
        tb1.exibeTodos();


    }
}
