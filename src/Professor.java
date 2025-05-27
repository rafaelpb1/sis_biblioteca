import java.util.List;

public class Professor extends Usuario {
    private String disciplina;
    private String titulo;

    public Professor(String nome, int id, String disciplina, String titulo) {
        super(nome, id);
        this.disciplina = disciplina;
        this.titulo = titulo;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                "disciplina='" + disciplina + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
