import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        List<EmprestimoDTO> emprestimos = new ArrayList<>();

        System.out.println("cadastro de clientes:");
        while (true) {
            System.out.print("nome do clinte ou 'sair' para encerrar: ");
            String nomeCliente = scanner.nextLine();

            if (nomeCliente.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("CPF: ");
            String cpfCliente = scanner.nextLine();
            System.out.print("endereço: ");
            String enderecoCliente = scanner.nextLine();
            System.out.print("data de nascimento (dd/MM/yyyy): ");
            String dataNascimentoCliente = scanner.nextLine();
            System.out.print("telefone: ");
            String telefoneCliente = scanner.nextLine();
//            scanner.nextLine();

            Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente,
                    converterStringParaLocalDate(dataNascimentoCliente), telefoneCliente);
            clientes.add(cliente);
        }
        System.out.println("cadastro de livros:");
        while (true) {
            System.out.print("nome do livro ou 'sair' para encerrar: ");
            String nomeLivro = scanner.nextLine();

            if (nomeLivro.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("autor: ");
            String autorLivro = scanner.nextLine();
            System.out.print("quantidade de Páginas: ");
            int paginasLivro = scanner.nextInt();
            scanner.nextLine();
            System.out.print("editora: ");
            String editoraLivro = scanner.nextLine();

            Livro livro = new Livro(nomeLivro, autorLivro, paginasLivro, editoraLivro);
            livros.add(livro);
        }

        System.out.println("emprestimo de livro:");
        while (true) {
            System.out.print("digite o nome do cliente ou 'sair' para encerrar: ");
            String nomeClienteEmprestimo = scanner.nextLine();

            if (nomeClienteEmprestimo.equalsIgnoreCase("sair")) {
                break;
            }

            Cliente clienteEmprestimo = encontrarClientePorNome(clientes, nomeClienteEmprestimo);

            if (clienteEmprestimo != null) {
                System.out.println("livros disponíveis:");
                for (Livro livro : livros) {
                    System.out.println(livro.getNome());
                }

                System.out.print("digite o nome do livro: ");
                String nomeLivroEmprestimo = scanner.nextLine();

                Livro livroEmprestimo = encontrarLivroPorNome(livros, nomeLivroEmprestimo);

                if (livroEmprestimo != null) {
                    LocalDate dataEmprestimo = LocalDate.now();
                    LocalDate dataDevolucao = dataEmprestimo.plusDays(7); // Adiciona 7 dias

                    EmprestimoDTO emprestimo = new EmprestimoDTO(clienteEmprestimo, livroEmprestimo, dataEmprestimo, dataDevolucao);
                    emprestimos.add(emprestimo);

                    System.out.println("emprestimo realizado com sucesso:");
                    System.out.println(emprestimo);
                } else {
                    System.out.println("livro nao encontrdo. tente novamente.");
                }

                System.out.print("digite o nome do cliente ou 'sair' para encerrar: ");
                nomeClienteEmprestimo = scanner.nextLine();
            }

            System.out.println("lista de emprestimos realizados:");
            for (EmprestimoDTO emprestimo : emprestimos) {
                System.out.println(emprestimo);
            }

        }
    }
    
    private static LocalDate converterStringParaLocalDate (String dataStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataStr, formatter);
    }

    private static Cliente encontrarClientePorNome(List<Cliente> clientes, String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    private static Livro encontrarLivroPorNome(List<Livro> livros, String nome) {
        for (Livro livro : livros) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null;
    }
}