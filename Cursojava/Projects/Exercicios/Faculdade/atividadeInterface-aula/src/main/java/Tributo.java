import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> lista;


    public Tributo() {
        lista = new ArrayList<Tributavel>();
    }

    public void adicionaTributavel(Tributavel t){
        lista.add(t);
        System.out.println("ADICIONADO");
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;

        for (Tributavel t: lista) {
            total += t.getValorTributo();
        }
        return total;
    }

    public void exibeTodos(){
        for (Tributavel t: lista) {
            System.out.println(t);
        }

    }


}
