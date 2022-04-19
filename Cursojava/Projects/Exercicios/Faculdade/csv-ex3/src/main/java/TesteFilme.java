import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteFilme {
    public static void gravaArquivoCsv(ListaObj<Filme> lista, String nomeArq) {
        FileWriter arq = null; // objeto que representa o arquivo que será usado para escrita
        Formatter saida = null; // objeto que será usado para escrever no arquivo
        Boolean deuRuim = false;
        nomeArq += 1 + ".csv";   // acrescenta a extensão do arquivo .csv

        // Bloco try-catch para abrir o arquivo
        try {
            arq = new FileWriter(nomeArq);
            // no comando anterior, se quiser abrir o arquivo para acrescentar no final
            // tem que ser arq = new FileWriter(nomeArq, true);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo!");
            System.exit(1);
        }

        // Bloco try-catch para gravar no arquivo
        try {
            // Percorro a lista de cachorros
            for (int i = 0; i < lista.getTamanho(); i++) {
                // Obtenho um objeto da lista por vez (índice i)
                Filme filme = lista.getElemento(i);
                // Gravo um registro com as informações do objeto dog
                // Delimito cada campo com ; pois é um arquivo CSV
                // Importante aqui: não preencher com espaços em branco
                saida.format("%d;%s;%s;%d;%.2f\n",filme.getIdFilme(),filme.getNome(),
                        filme.getGenero(), filme.getIdade(), filme.getNota());
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar arquivo");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void gravaArquivoCsvGenero(ListaObj<Filme> lista, String nomeArq, String genero) {
        FileWriter arq = null; // objeto que representa o arquivo que será usado para escrita
        Formatter saida = null; // objeto que será usado para escrever no arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";   // acrescenta a extensão do arquivo .csv

        // Bloco try-catch para abrir o arquivo
        try {
            arq = new FileWriter(nomeArq);
            // no comando anterior, se quiser abrir o arquivo para acrescentar no final
            // tem que ser arq = new FileWriter(nomeArq, true);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo!");
            System.exit(1);
        }

        // Bloco try-catch para gravar no arquivo
        try {
            // Percorro a lista de cachorros
            for (int i = 0; i < lista.getTamanho(); i++) {
                // Obtenho um objeto da lista por vez (índice i)
                Filme filme = lista.getElemento(i);
                if(filme.getGenero().equals(genero)) {
                    saida.format("%d;%s;%s;%d;%.2f\n", filme.getIdFilme(), filme.getNome(),
                            filme.getGenero(), filme.getIdade(), filme.getNota());
                }
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar arquivo");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leArquivoCsv(String nomeArq) {
        FileReader arq = null; // obj que representa o arquivo que será aberto para leitura
        Scanner entrada = null; // obj que será usado para ler do arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";

        // Bloco try-catch para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            // defino que o delimitador de campo na leitura será o ; ou o \n (final do registro)
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        // Bloco try-catch para ler o arquivo
        try {
            // Exibe uma linha com os títulos das colunas
            System.out.printf("%s %s %s %s %s\n","ID","NOME","NOTA","GENERO", "IDADE");
            while (entrada.hasNext()) {     // enquanto não chega ao final do arquivo
                // Leio o valor de cada campo, como quando leio do teclado usando Scanner
                int id = entrada.nextInt();
                String nome = entrada.next();
                Double nota = entrada.nextDouble();   // aqui o next lê a String delimitada por ; então lê mesmo qdo tem nomes separados por branco
                String genero = entrada.next();
                int idade = entrada.nextInt();
                // Exibe os dados em formato de colunas
                System.out.printf("%d %s %s %d %.2f\n", id,nome,genero,idade,nota);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaObj list = new ListaObj(7);

        boolean stop = true;
        while(stop){
            System.out.println("Escolha uma opção");
            System.out.println("1 - Adicionar um filme " +
                    "\n2 - Exibir a lista " +
                    "\n3 - Gravar a lista em arquivo CSV " +
                    "\n4 - Ler e exibir um arquivo CSV " +
                    "\n5 - Gravar em outro arquivo CSV apenas filmes que estâo na lista, mas de um determinado gênero " +
                    "\n6 - Sair");
            int chose  = sc.nextInt();
            switch (chose){
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Digite as informações do filme: ");
                    System.out.println("Código:");
                    int idFilme = sc1.nextInt();

                    System.out.println("Nome:");
                    sc1.nextLine();
                    String nome = sc1.nextLine();

                    System.out.println("Nota(0 a 10):");
                    Double nota = sc1.nextDouble();


                    System.out.println("Gênero:");
                    sc1.nextLine();
                    String genero = sc1.nextLine();

                    System.out.println("Idade:");
                    int idade = sc1.nextInt();

                    Filme filme = new Filme(idFilme, nome, nota, genero, idade);
                    list.adiciona(filme);
                    break;
                case 2:
                    list.exibe();
                    break;
                case 3:
                    gravaArquivoCsv(list, "Filme");
                    break;
                case 4:
                    leArquivoCsv("Filme1");
                    break;
                case 5:
                    System.out.println("Escreva o genero que quer a lista: ");
                    String generoList = sc.nextLine();

                    gravaArquivoCsvGenero(list, "FilmesGenero", generoList);
                    break;
                case 6:
                    stop = false;
                    break;
                default:
                    System.out.println("Digite um nùmero válido!");
                    break;
            }



        }


    }
}
