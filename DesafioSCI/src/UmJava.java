import java.util.Scanner;

public class UmJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double somaNumeros = 0;
        double quantidadePar = 0;
        double quantidadeImpar = 0;

        System.out.println("Digite 5 números:");
        for (int contador = 0; contador < 5; contador++) {
            double numero = scanner.nextDouble();
            somaNumeros += numero;

            if (numero % 2 == 0) {
                quantidadePar++;
                System.out.println(numero + " é par.");
            } else {
                quantidadeImpar++;
                System.out.println(numero + " é ímpar.");
            }
        }

        System.out.println("Média geral: " + somaNumeros / 5);
        System.out.println("Quantidade de números pares: " + quantidadePar);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);
        scanner.close();
	}

}
