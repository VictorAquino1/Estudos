import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner sc = new Scanner(System.in);
        int num1 = 0;


        System.out.println("Digite 7 numeros");
        for (int i = 0; i<10 ; i++){
            System.out.println("Digite o numero: "+ i+1);
            int num = sc.nextInt();
            lista[i] = num;
        }
        int numRep = 0;
        System.out.println("Pesquise o numero repetido: ");
        int num2 = sc.nextInt();
        for (int i:lista) {
            if (i==num2){
                numRep++;
            }
        }
        System.out.println(String.format("O numero %d aparece %d", num2, numRep));
    }
}
