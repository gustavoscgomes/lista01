import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Aluno> listaDeAlunos = new ArrayList<>();
        while (true) {
            System.out.print("digite o nome do aluno ou sair para encerrar: ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("digite a 1ª nota do aluno: ");
            double nota01 = sc.nextDouble();
            System.out.print("digite a 2ª nota do aluno: ");
            double nota02 = sc.nextDouble();
            System.out.print("digite a 3ª nota do aluno: ");
            double nota03 = sc.nextDouble();
            sc.nextLine();

            listaDeAlunos.add(new Aluno(nome, nota01, nota02, nota03));

        }

        double somaDasMedias = 0.0;
        for (Aluno aluno : listaDeAlunos) {
            System.out.println(aluno);
            System.out.println("media: " + aluno.calcularMedia());
            System.out.println();
            somaDasMedias += aluno.calcularMedia();
        }

        double mediaDasMedias = somaDasMedias / listaDeAlunos.size();

        System.out.printf("a media da turma foi: %.2f", mediaDasMedias);
    }
}