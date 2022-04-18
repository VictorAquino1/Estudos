public class Teste {

    public static void main(String[] args) {
        int indRetornado;

        ListaEstatica lista = new ListaEstatica(5);

        lista.exibe();

        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        lista.exibe();

        lista.adiciona(40);
        lista.adiciona(50);
        System.out.println("\nTentando adicionar o sexto elemento");
        lista.adiciona(60);

        lista.exibe();

        System.out.println("\nBuscando o elemento 30");
        indRetornado = lista.busca(30);
        if (indRetornado == -1) {
            System.out.println("Elemento 30 não foi encontrado");
        }
        else {
            System.out.println("Elemento 30 encontrado no índice " + indRetornado);
        }

        System.out.println("\nBuscando o elemento 100");
        indRetornado = lista.busca(100);
        if (indRetornado == -1) {
            System.out.println("Elemento 100 não foi encontrado");
        }
        else {
            System.out.println("Elemento 100 encontrado no índice " + indRetornado);
        }

        System.out.println("\nRemovendo o elemento do índice 4");
        if (lista.removePeloIndice(4)) {
            System.out.println("Removido elemento do índice 4");
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

        System.out.println("\nRemovendo o elemento 30");
        if (lista.removeElemento(30)) {
            System.out.println("Removido elemento 30");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

        System.out.println("\nRemovendo o elemento 55");
        if (lista.removeElemento(55)) {
            System.out.println("Removido elemento 55");
        }
        else {
            System.out.println("Remoção inválida");
        }

        lista.exibe();

    }
}
