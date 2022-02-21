import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Educadores> lista;

    public ControleBonus() {
        lista = new ArrayList<>();
    }

    public void adicionarEducador(Educadores e){
        lista.add(e);
    }

    public void exibeTodos(){
        for (Educadores e: lista) {
            System.out.println(e);
        }
    }

    public Double calcularTotal(){
        Double total= 0.0;
        for (Educadores e: lista) {
            total += e.getValorBonus();
        }
        return total;
    }


}
