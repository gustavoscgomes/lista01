public class Livro {
    private String nome;
    private String autor;
    private int quantidaDePginas;
    private String editora;

    public Livro(String nome, String autor, int quantidaDePginas, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.quantidaDePginas = quantidaDePginas;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", quantidaDePginas=" + quantidaDePginas +
                ", editora='" + editora + '\'' +
                '}';
    }
}
