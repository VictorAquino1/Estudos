import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Filial> lista;

    public Empresa(String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    public void adicionarFilial(Filial f){
        lista.add(f);
    }
    public void exibeTodos(){
        for (Filial f: lista) {
            System.out.println(f);
        }
    }
    public Double calcularTotal(){
        Double total = 0.0;
        for (Filial f: lista) {
                total += f.calcularLucro();
        }
        return total;
    }
}
