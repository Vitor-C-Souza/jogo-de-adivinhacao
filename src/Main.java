import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroParaAdivinhar = random.nextInt(100);
        int numeroDigitado;

        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de 0 a 100: ");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado > numeroParaAdivinhar) {
                System.out.println("Numero digitado é maior!");
            } else if (numeroDigitado < numeroParaAdivinhar) {
                System.out.println("Numero digitado é menor!");
            } else {
                System.out.println("Acertou o numero secreto parabens!!");
                break;
            }
        }

        System.out.println("O numero secreto é " + numeroParaAdivinhar);
    }
}