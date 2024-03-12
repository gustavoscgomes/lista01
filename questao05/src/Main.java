import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite uma String simples(apenas uma palavra): ");
        String palavra = sc.nextLine();

        char[] lista = palavraToList(palavra);
        Arrays.sort(lista);

        for (char letra : lista) {
            System.out.print(letra);
        }

    }
    public static char[] palavraToList(String palavra) {
        char[] listaNaoOrdenada = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            listaNaoOrdenada[i] = palavra.charAt(i);
        }
        return listaNaoOrdenada;
    }

}