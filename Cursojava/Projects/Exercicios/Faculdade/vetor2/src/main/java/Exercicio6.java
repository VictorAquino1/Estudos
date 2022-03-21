import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] ano = new Integer[]{31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Digite um dia(1 a 31): ");
        Integer day = sc.nextInt();
        System.out.println("Digite um mes(1 a 12): ");
        Integer month = sc.nextInt();
        Integer sum = 0;

        for (int i =0;i<(month-1); i++){
          sum += ano[i];
        }

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano.", day, month, (sum+day)));
    }
}
