import java.util.Scanner;

public class CincoJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] notas = new double[3][4];
        double[] medias = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do " + (i+1) + "º aluno:");
            nomes[i] = scanner.nextLine();

            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a " + (j+1) + "ª nota de " + nomes[i] + ":");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            scanner.nextLine();
            medias[i] = soma / 4;
        }

        System.out.println("Médias:");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + ": " + medias[i]);
        }

        double mediaGeral = 0;
        for (int i = 0; i < 3; i++) {
            mediaGeral += medias[i];
        }
        mediaGeral /= 3;
        System.out.println("Média geral da turma: " + mediaGeral);

        int indiceMaiorMedia = 0;
        double maiorMedia = medias[0];
        for (int i = 1; i < 3; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                indiceMaiorMedia = i;
            }
        }
        System.out.println("Aluno com a maior média: " + nomes[indiceMaiorMedia]);

        int indiceMenorMedia = 0;
        double menorMedia = medias[0];
        for (int i = 1; i < 3; i++) {
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                indiceMenorMedia = i;
            }
        }

        System.out.println("Aluno com a menor média: " + nomes[indiceMenorMedia]);
        scanner.close();
        
	}

}
