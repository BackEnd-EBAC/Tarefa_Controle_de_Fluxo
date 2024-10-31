import java.util.Scanner;

public class Tarefa_Controle_de_Fluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.print("Informe a segunga nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        Double nota3 = scanner.nextDouble();

        System.out.print("Informe a quarta nota: ");
        Double nota4 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final é : " + media);

        if (media >= 7) {
            System.out.println("O aluno está aprovado");
        } else if (media >= 5) {
            System.out.println("O aluno está de recuperação");
        } else {
            System.out.println("O aluno está reprovado");
        }

        scanner.close();
    }
}