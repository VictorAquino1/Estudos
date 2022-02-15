import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> lista;

    public Carrinho() {
    lista = new ArrayList<Vendavel>();
    }

    public void adicionarVenda(Vendavel v){
        lista.add(v);
    }

    public Double calcularTotalVenda(){
        Double total=0.0;
        for (Vendavel v: lista) {
            total += calcularTotalVenda();
        }
        return total;
    }

    public void exibirItensCarrinho(){
        for (Vendavel v: lista) {
            System.out.println(v);
        }
    }




}
