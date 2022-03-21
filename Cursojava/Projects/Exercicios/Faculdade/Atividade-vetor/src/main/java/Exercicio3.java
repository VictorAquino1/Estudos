import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
//3.  Escreva um programa que cria um vetor para armazenar 10 Strings. O programa deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse vetor.
// Depois, o programa deve pedir que se digite um nome qualquer. O programa deverá pesquisar se esse nome está no vetor.
// Se estiver, deve exibir a mensagem: “Nome encontrado no índice x”, sendo x o índice do nome no vetor, senão deve exibir uma mensagem de “Nome não encontrado”.
        String[] lista = new String[10];
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite 10 numeros");
        for (int i = 0; i<10 ; i++){
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();
            lista[i] = nome;
        }
        System.out.println("Pesquise um nome: ");
        String findname = sc.nextLine();
        for (int i = 0; i<10 ; i++) {
            if(findname.equalsIgnoreCase(lista[i])){
                System.out.println("Nome encontrado no índice "+ i);
                num++;
            }
        }
        if(num==0){
            System.out.println("Nome não encontrado");
        }

    }
}
