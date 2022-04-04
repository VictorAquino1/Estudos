public class teste {
    public static void main(String[] args) {
        ListaObj<Produto> lista = new ListaObj(3);
        Produto prd1 = new Produto(100,"Notebook",10.50, "***");
        prd1.comprar(10);
        prd1.calcularFaturamento();
        lista.adiciona(prd1);
        System.out.println(prd1);



    }
}
