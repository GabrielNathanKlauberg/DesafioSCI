import java.util.Scanner;

public class QuatroJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int contador = 0; contador < 5; contador++) {
            System.out.printf("Informe o %dº numero: ", contador + 1);
            numeros[contador] = scanner.nextDouble();
        }

        System.out.printf("O valor registrado na posição três é: %.2f", numeros[2]);
        scanner.close();

	}

}