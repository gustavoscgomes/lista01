import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um nome completo: ");
        String nomeCompleto = sc.nextLine();

        String iniciais = obterIniciais(nomeCompleto);

        System.out.println("as iniciais do nome são: " + iniciais);

        sc.close();
    }
    public static String obterIniciais(String nomeCompleto) {
        StringBuilder iniciais = new StringBuilder();

        String[] palavras = nomeCompleto.split("\\s+");

        for (String palavra : palavras) {
            if (!palavra.isEmpty() && !ehPreposicao(palavra)) {
                iniciais.append(palavra.charAt(0)).append('.');
            }
        }

        return iniciais.toString();
    }

    private static boolean ehPreposicao(String palavra) {
        return palavra.equalsIgnoreCase("de") || palavra.equalsIgnoreCase("da")
                || palavra.equalsIgnoreCase("do");
    }
}