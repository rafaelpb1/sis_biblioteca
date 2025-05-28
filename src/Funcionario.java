
public class Funcionario extends Usuario {
    private String cargo;
    private String setor;

    public Funcionario(String nome, int id, String cargo, String setor) {
        super(nome, id);
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{{" +
                "nome='" + getNome() + '\'' +
                "cargo='" + cargo + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }
}
