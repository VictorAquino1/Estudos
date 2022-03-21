import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

//2.  Escreva um programa que cria um vetor para armazenar 10 inteiros. O programa deve solicitar que o usuário digite 10 números, que devem ser armazenados nesse vetor.
  //      O programa deverá calcular a média dos números digitados e exibir a média.
//Depois, deverá exibir os números que estão no vetor que estão acima da média.
        int[] lista = new int[10];
        Scanner sc = new Scanner(System.in);
        int media = 0;
        double total = 0.0;

        System.out.println("Digite 7 numeros");
        for (int i = 0; i<10 ; i++){
            System.out.println("Digite o numero: "+ i+1);
            int num = sc.nextInt();
            lista[i] = num;
        }
        for (int i: lista) {
            media += i;
        }
        total = media/10;
        System.out.println("A média é de: "+media);

        System.out.println("Os valores na média são:");
        for (int i: lista) {
            if (i > total){
                System.out.println(i);
            }
        }

    }
}
