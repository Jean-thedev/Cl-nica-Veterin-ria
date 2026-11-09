import java.util.ArrayList;
public class Dono {
    private String nome;
    private int telefone;
    ArrayList<Animal> animais = new ArrayList<Animal>();

    public Dono(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    

}
