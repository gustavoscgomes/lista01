import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("eh primo.");
        } else {
            System.out.println("nao eh primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}