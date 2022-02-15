import java.util.Scanner;

public class testaCarrinho {
    public static void main(String[] args) {
        Carrinho carro1 = new Carrinho();
        Scanner sc = new Scanner(System.in);

        System.out.println("===MENU===");
        System.out.println("Selecione um item do menu abaixo: ");
        System.out.println("1 - Adicionar livro \n 2 - Adicionar DVD \n 3 - Adicionar servico \n " +
                            "4 - Exibir itens do carrinho \n 5 - Exibir total de vendas \n 6 - FIM");

        Integer menu = sc.nextInt();

        switch (menu){
            case 1:
                System.out.println("Digite as informações do livro");
                System.out.println("Código :");
                Integer codigo = sc.nextInt();
                System.out.println("Nome :");
                String nome = sc.nextLine();
                System.out.println("Custo :");
                Double custo = sc.nextDouble();
                System.out.println("Livro :");
                String nomeLivro = sc.nextLine();
                System.out.println("ISBN :");
                String codigoIsbn = sc.nextLine();

                Livro livro = new Livro(codigo, nome, custo, nomeLivro, codigoIsbn);
                carro1.adicionarVenda(livro);
                break;
            case 2:
                System.out.println("Digite as informações do DVD");
                System.out.println("Código :");
                Integer codigoDvd = sc.nextInt();
                System.out.println("Nome :");
                String nomeDvd = sc.nextLine();
                System.out.println("Custo :");
                Double custoDvd = sc.nextDouble();
                System.out.println("Livro :");
                String gravadora = sc.nextLine();


                Dvd dvd = new Dvd(codigoDvd, nomeDvd, custoDvd, gravadora);
                carro1.adicionarVenda(dvd);
                break;
            case 3:
                System.out.println("Digite as informações do Serviço");
                sc.nextLine();
                System.out.println("Código :");
                Integer codigoDvd = sc.nextInt();
                System.out.println("Nome :");
                String nomeDvd = sc.nextLine();
                System.out.println("Custo :");
                Double custoDvd = sc.nextDouble();
                System.out.println("Livro :");
                String gravadora = sc.nextLine();


                Dvd dvd = new Dvd(codigoDvd, nomeDvd, custoDvd, gravadora);
                carro1.adicionarVenda(dvd);
                break;
            case 4:
            case 5:
            case 6:

        }


    }

}
