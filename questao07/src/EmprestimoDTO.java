import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmprestimoDTO {
    private Cliente cliente;
    private Livro livro;
    private LocalDate dataDeEmprestimo;
    private LocalDate dataDeDevolucao;

    public EmprestimoDTO(Cliente cliente, Livro livro, LocalDate dataDeEmprestimo, LocalDate dataDeDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataDeDevolucao = dataDeDevolucao;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "EmprestimoDTO{" +
                "cliente=" + cliente.getNome() +
                ", livro=" + livro.getNome() +
                ", dataDeEmprestimo=" + dtf.format(dataDeEmprestimo) +
                ", dataDeDevolucao=" + dtf.format(dataDeDevolucao) +
                '}';
    }
}
