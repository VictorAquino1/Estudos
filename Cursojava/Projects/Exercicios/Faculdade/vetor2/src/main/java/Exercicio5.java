import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] modelsCar = new String[5];
        Double[] performance = new Double[5];

        System.out.println("Digite 5 modelos diferentes de carros: ");
        for (int i = 0; i< 5; i++){
            modelsCar[i] = sc.nextLine();
        }
        System.out.println("Digite o rendimento dos carros respectivamente: ");
        for (int i = 0; i< modelsCar.length; i++){
            performance[i] = sc.nextDouble();
        }
        Double maxPerf = 0.0;
        int index = 0;
        for (int i = 0; i<performance.length; i++) {
            if (performance[i]>maxPerf){
                maxPerf = performance[i];
                index = i;
            }
        }
        System.out.println(String.format("O carro com maior rendimento é o %s, com rendimento de %.2f", modelsCar[index], maxPerf));

    }


}
