public class Teste {

    public static void main(String[] args) {
        int indRetornado;

        ListaObj <String> lista = new ListaObj(5);

        lista.exibe();

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        lista.exibe();

        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println("\nTentando adicionar o sexto elemento");
        lista.adiciona("F");

        lista.exibe();

        System.out.println("\nBuscando o elemento D");
        indRetornado = lista.busca("D");
        if (indRetornado == -1) {
            System.out.println("Elemento D não foi encontrado");
        }
        else {
            System.out.println("Elemento D encontrado no índice " + indRetornado);
        }

        System.out.println("\nBuscando o elemento H");
        indRetornado = lista.busca("H");
        if (indRetornado == -1) {
            System.out.println("Elemento H não foi encontrado");
        }
        else {
            System.out.println("Elemento H encontrado no índice " + indRetornado);
        }

        System.out.println("\nRemovendo o elemento do índice 3");
        if (lista.removePeloIndice(3)) {
            System.out.println("Removido elemento do índice 3");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

        System.out.println("\nRemovendo o elemento do índice 0");
        if (lista.removePeloIndice(0)) {
            System.out.println("Removido elemento do índice 0");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

        System.out.println("\nRemovendo o elemento do índice 7");
        if (lista.removePeloIndice(7)) {
            System.out.println("Removido elemento do índice 7");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

        System.out.println("\nRemovendo o elemento B");
        if (lista.removeElemento("B")) {
            System.out.println("Removido elemento B");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

        System.out.println("\nRemovendo o elemento K");
        if (lista.removeElemento("K")) {
            System.out.println("Removido elemento K");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

        System.out.println("Tamanho da lista: " + lista.getTamanho());

        System.out.println("Elemento do índice 1: " + lista.getElemento(1));

        lista.exibe();
        lista.limpa();
        lista.exibe();


    }
}
