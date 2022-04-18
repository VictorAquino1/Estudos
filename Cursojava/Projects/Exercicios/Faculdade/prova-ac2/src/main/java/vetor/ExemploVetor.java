import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("v["+i+"]= " + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Criação de um objeto leitor
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int soma = 0;
        int contaPares = 0;
        int tamanho;

        // Criação de um vetor de 5 inteiros
        int[] vetor = new int[5];

        // Criação de um 2o vetor de inteiros, com lista de inicializadores
        // O vetor já "nasce" com valores
        int[] vet2 = { 100, 200, 300, 400, 500, 600, 700};

        // Criação de um 3o vetor de Strings
        String[] vet3 = new String[4];

        // Criação de um 5o vetor de inteiros, cujo tamanho
        // será digitado pelo usuário
        int[] vet5;

        // Atribuição de valores para o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }

        // Exibe o vetor
        exibeVetor(vetor);

        // Exibe o vetor vet2
        exibeVetor(vet2);

        // Loop para preencher o vetor com valores digitados pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor para vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        // Exibe o vetor
        exibeVetor(vetor);

        // Loop para preencher o vetor vet3 com valores digitados pelo usuário
        for (int i = 0; i < vet3.length; i++) {
            System.out.println("Digite o valor para vet3[" + i + "]");
            vet3[i] = leitor.next();
        }

        // Exibe o vetor vet3
        for (String nome : vet3) {
            System.out.print(nome + "\t");
        }
        System.out.println();

        // Desafio 1
        // Exibir a soma dos elementos do vetor
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("A soma dos elementos do vetor é " + soma);

        // Desafio 2
        // Exibir a quantidade de elementos pares do vetor
        for (int num : vetor) {
            if (num % 2 == 0) {
                contaPares++;
            }
        }
        System.out.println("A quantidade de pares no vetor é " + contaPares);

        // Desafio 3
        // Criar um 4o vetor de Strings, já inicializado com os nomes
        // dos dias da semana: "Domingo", "Segunda", "Terça", etc
        // Solicitar que o usuário digite um número inteiro de 1 a 7
        // Enquanto o número não for de 1 a 7, fique num loop até
        // que o número seja válido
        // Exiba o dia da semana correspondente, sendo que 1 é Domingo,
        // 2 é Segunda, etc


        // Solicitar para o usuário digitar o tamanho do vetor vet5
        // O tamanho válido deve ser maior do que 2
        do {
            System.out.println("Digite um número maior do que 2");
            tamanho = leitor.nextInt();
        } while (tamanho <= 2);

        // Cria o vet5 com o tamanho digitado pelo usuário
        vet5 = new int[tamanho];

        // Loop para preencher o vet5 com valores digitados pelo usuário
        for (int i = 0; i < vet5.length; i++) {
            System.out.println("Digite o valor para vet5[" + i + "]");
            vet5[i] = leitor.nextInt();
        }

        // Exibe o vetor
        exibeVetor(vet5);

    }
}
