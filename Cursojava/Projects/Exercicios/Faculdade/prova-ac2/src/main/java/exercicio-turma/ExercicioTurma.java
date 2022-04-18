import java.util.Scanner;

public class ExercicioTurma {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome, turma;
        String[] turma1 = new String[10];   // vetor da turma1
        String[] turma2 = new String[10];   // vetor da turma2
        int indT1 = 0;  // indT1 tem uma dupla função: representa
                        // a quantidade de alunos inseridos na turma1
                        // e indica a posição onde vai entrar o próx aluno
        int indT2 = 0;  // indT2 tem uma dupla função: representa
                        // a quantidade de alunos inseridos na turma2
                        // e indica a posição onde vai entrar o próx aluno

        // Loop para ler os nomes de 10 alunos e suas turmas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome de um aluno");
            nome = leitor.next();
            // Validação da turma: só aceita t1 ou t2
            do {
                System.out.println("Digite a turma do aluno: T1 ou T2");
                turma = leitor.next();
            } while (!turma.equalsIgnoreCase("T1") &&
                     !turma.equalsIgnoreCase("T2"));
//            ou poderia ser assim:
//            (!(turma.equalsIgnoreCase("T1") ||
//               turma.equalsIgnoreCase("T2")));
            // Se o aluno é da turma T1
            if (turma.equalsIgnoreCase("T1")) {
                turma1[indT1++] = nome;   // Coloca o nome o vetor turma1, no índice indT1
                                          // e incrementa indT1
            }
            else {
                turma2[indT2++] = nome;   // senão coloca o nome no outro vetor, no índice
                                          // indT2 e incrementa indT2
            }
        }

        // Exibe quantos alunos há na turma e os nomes dos alunos de cada turma
        if (indT1 == 0) {
            System.out.println("Não há alunos na turma1");
        }
        else {
            System.out.println("Há " + indT1 + " alunos na turma1:");
            for (int i=0; i < indT1; i++) {
                System.out.println(turma1[i]);
            }
        }

        if (indT2 == 0) {
            System.out.println("Não há alunos na turma2");
        }
        else {
            System.out.println("Há " + indT2 + " alunos na turma2:");
            for (int i=0; i < indT2; i++) {
                System.out.println(turma2[i]);
            }
        }


    }
}
