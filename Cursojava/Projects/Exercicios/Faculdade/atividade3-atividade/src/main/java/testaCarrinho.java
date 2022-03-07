import java.util.Scanner;

public class testaCarrinho {
    public static void main(String[] args) {
        Carrinho carro1 = new Carrinho();
        Scanner sc = new Scanner(System.in);

        Boolean inter = true;
while(inter){

    System.out.println("===MENU===");
    System.out.println("Selecione um item do menu abaixo: ");
    System.out.println("1 - Adicionar livro \n 2 - Adicionar DVD \n 3 - Adicionar servico \n " +
            "4 - Exibir itens do carrinho \n 5 - Exibir total de vendas \n 6 - FIM");

    Integer menu = sc.nextInt();

    switch (menu) {

        case 1:
            System.out.println("Digite as informações do livro");
            System.out.println("Código :");
            Integer codigo = sc.nextInt();
            System.out.println("Nome :");
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.println("Custo :");
            Double custo = sc.nextDouble();
            System.out.println("Autor do livro :");
            String nomeAutor = sc.nextLine();
            sc.nextLine();
            System.out.println("ISBN :");
            String codigoIsbn = sc.nextLine();

            Livro livro = new Livro(codigo, nome, custo, nomeAutor, codigoIsbn);
            carro1.adicionarVenda(livro);
            System.out.println(livro);
            break;

        case 2:
            System.out.println("Digite as informações do DVD");
            System.out.println("Código :");
            Integer codigoDvd = sc.nextInt();
            System.out.println("Nome :");
            String nomeDvd = sc.nextLine();
            sc.nextLine();
            System.out.println("Custo :");
            Double custoDvd = sc.nextDouble();
            System.out.println("Livro :");
            String gravadora = sc.nextLine();

            Dvd dvd = new Dvd(codigoDvd, nomeDvd, custoDvd, gravadora);
            carro1.adicionarVenda(dvd);
            System.out.println(dvd);
            break;

        case 3:
            System.out.println("Digite as informações do Serviço");
            System.out.println("Descrição :");
            String descricaoService = sc.nextLine();
            sc.nextLine();
            System.out.println("Código :");
            Integer codigoService = sc.nextInt();
            System.out.println("Quantidade de horas :");
            Integer qtdesHoras = sc.nextInt();
            System.out.println("Valor Horas :");
            Double valorHoras = sc.nextDouble();

            Servico service = new Servico(descricaoService, codigoService, qtdesHoras, valorHoras);
            carro1.adicionarVenda(service);
            System.out.println(service);
            break;
        case 4:
            carro1.exibirItensCarrinho();
            break;
        case 5:
            System.out.println(carro1.calcularTotalVenda());
            break;
        case 6:
            System.out.println("ADEUS!");
            inter = false;
    }
    }
    }
}
