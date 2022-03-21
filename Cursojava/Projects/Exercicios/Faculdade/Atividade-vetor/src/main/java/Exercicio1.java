import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] lista = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 7 numeros");

        for (int i = 0; i<7 ; i++){
            System.out.println("Digite o numero: "+ i);
            int num = sc.nextInt();
            lista[i] = num;
        }
        System.out.println("ORDEM CRESCENTE");
        for (int i: lista) {
            System.out.println(i);
        }
        System.out.println("ORDEM DECRESCENTE");
        for (int i = 6; i>=0 ; i--){
            System.out.println(lista[i]);
        }
    }
}
