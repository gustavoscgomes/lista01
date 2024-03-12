public class Aluno {
    private String nome;
    private double nota01;
    private double nota02;
    private double nota03;

    public Aluno(String nome, double nota01, double nota02, double nota03) {
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }

    public double calcularMedia() {
        return (nota01 + nota02 + nota03) / 3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota01=" + nota01 +
                ", nota02=" + nota02 +
                ", nota03=" + nota03 +
                '}';
    }
}
