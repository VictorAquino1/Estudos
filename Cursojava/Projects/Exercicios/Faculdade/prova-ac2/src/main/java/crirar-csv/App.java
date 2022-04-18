import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    public static void gravaArquivoCsv(ListaObj<Cachorro> lista, String nomeArq) {
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
                Cachorro dog = lista.getElemento(i);
                // Gravo um registro com as informações do objeto dog
                // Delimito cada campo com ; pois é um arquivo CSV
                // Importante aqui: não preencher com espaços em branco
                saida.format("%d;%s;%s;%.2f\n",dog.getId(),dog.getNome(),
                                             dog.getPorte(),dog.getPeso());
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
            System.out.printf("%4s %-15s %-9s %5s\n","ID","NOME","PORTE","PESO");
            while (entrada.hasNext()) {     // enquanto não chega ao final do arquivo
                // Leio o valor de cada campo, como quando leio do teclado usando Scanner
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();   // aqui o next lê a String delimitada por ; então lê mesmo qdo tem nomes separados por branco
                Double peso = entrada.nextDouble();
                // Exibe os dados em formato de colunas
                System.out.printf("%4d %-15s %-9s %5.2f\n",id, nome, porte, peso);
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
        ListaObj<Cachorro> listaDog = new ListaObj(7);

        listaDog.adiciona(new Cachorro(1, "Pipo","Medio",10.0));
        listaDog.adiciona(new Cachorro(2, "Pacoca","Pequeno",5.0));
        listaDog.adiciona(new Cachorro(3, "Antonio","Grande",25.0));
        listaDog.adiciona(new Cachorro(4, "Marley e Eu","Grande",35.0));
        listaDog.adiciona(new Cachorro(5, "Joaca Luz","Medio",9.2));
        listaDog.adiciona(new Cachorro(6, "Leitao","Pequeno",4.5));

        listaDog.exibe();
        gravaArquivoCsv(listaDog, "dogs");
        leArquivoCsv("dogs");
    }
}
