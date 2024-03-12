import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereço;
    private LocalDate dataDeNascimento;
    private String telefone;

    public Cliente(String nome, String cpf, String endereço, LocalDate dataDeNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereço='" + endereço + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
