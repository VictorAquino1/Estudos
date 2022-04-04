public class teste {
    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj(5);

        lista.adiciona("victor");
        lista.adiciona("Brunao");
        lista.busca("victor");
                lista.exibe();
        System.out.println(lista.getElemento(1));
        lista.getTamanho();
        lista.limpa();
        lista.getTamanho();
    }


}
