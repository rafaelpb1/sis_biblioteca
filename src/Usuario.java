import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Emprestimo> emprestimoUsuario;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.emprestimoUsuario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Emprestimo> getEmprestimoUsuario() {
        return emprestimoUsuario;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo != null && !this.emprestimosDoUsuario.contains(emprestimo)) {
            this.emprestimosDoUsuario.add(emprestimo);
        }
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        this.emprestimosDoUsuario.remove(emprestimo);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "Usuario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
