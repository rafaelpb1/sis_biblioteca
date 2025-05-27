import java.util.List;

public class Aluno extends Usuario {
    private String matricula;
    private String curso;

    public Aluno(String nome, int id, String matricula, String curso) {
        super(nome, id);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                "matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
