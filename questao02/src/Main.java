import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(1001);
        int palpite;
        int tentativas = 0;

        System.out.println("tente adivinhar o numero entre 0 e 1000.");

        do {
            System.out.print("digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("o numero sorteado eh maior. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("o numero sorteado eh menor. Tente novamente.");
            } else {
                System.out.printf("parabens! Voce acertou o numero %d" +
                        " em %d tentativas.%n", numeroSorteado, tentativas);
            }

        } while (palpite != numeroSorteado);

        sc.close();
    }
}