public class App {

    public static void main(String[] args) {

        Professor prof1 = new Professor("Victor", 20, 40.00);
        Coordenador coord1 = new Coordenador("Davi", 40, 80.00, 20, 20);
        ControleBonus controle = new ControleBonus();


        controle.adicionarEducador(prof1);
        controle.adicionarEducador(coord1);

        controle.exibeTodos();
        System.out.println(controle.calcularTotal());
        



    }
}
