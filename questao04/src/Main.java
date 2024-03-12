import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um String qualquer: ");
        StringBuilder normal = new StringBuilder(sc.nextLine());

        System.out.println(normal.reverse());
    }
}