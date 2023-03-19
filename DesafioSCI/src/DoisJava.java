import java.util.Scanner;

public class DoisJava {

	public static void main(String[] args) {
		 
        Scanner scanner = new Scanner(System.in);

        double numero = 0;
        double numeroMaior = Double.MIN_VALUE;
        double numeroMenor = Double.MAX_VALUE;

        for (int contador = 0; contador < 5; contador++) {
            
            System.out.printf("Digite o %dº número: ", contador + 1);
            numero = scanner.nextDouble();

            if (numero > numeroMaior){
                numeroMaior = numero;
            }

            if( numero < numeroMenor ){
                numeroMenor = numero;
            }
        }

        System.out.println("Maior número digitado: " + numeroMaior);
        System.out.println("Menor número digitado: " + numeroMenor);

        scanner.close();
	}

}