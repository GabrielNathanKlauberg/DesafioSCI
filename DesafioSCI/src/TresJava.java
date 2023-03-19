import java.util.Scanner;

public class TresJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        do {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();
            
            double nota1, nota2, nota3, nota4;

            do {
                System.out.println("Digite a primeira nota:");
                nota1 = scanner.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("Digite a segunda nota:");
                nota2 = scanner.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            do {
                System.out.println("Digite a terceira nota:");
                nota3 = scanner.nextDouble();
            } while (nota3 < 0 || nota3 > 10);

            do {
                System.out.println("Digite a quarta nota:");
                nota4 = scanner.nextDouble();
            } while (nota4 < 0 || nota4 > 10);

            double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
            System.out.printf("A média do aluno %s é %.2f", nome, media);
            
            if (media < 6) {
                System.out.println(" - O aluno está reprovado.");
            } else {
                System.out.println(" - O aluno está aprovado.");
            }

            System.out.println("Deseja continuar? (S/N)");
            scanner.nextLine();
            continuar = scanner.nextLine().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
	}

}