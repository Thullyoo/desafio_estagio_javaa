import java.time.LocalDateTime;
import java.util.List;

public class Funcionario {

    String nome;

    String data_contratacao;

    Double salario;

    Double beneficio;

    Cargo cargo;

    List<Venda> vendas;

    public Funcionario(String nome, String data_contratacao, Cargo cargo) {
        this.nome = nome;
        this.data_contratacao = data_contratacao;
        this.cargo = cargo;
    }

    public Funcionario(String nome, String data_contratacao,Cargo cargo, List<Venda> vendas) {
        this.nome = nome;
        this.data_contratacao = data_contratacao;
        this.cargo = cargo;
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", data_contratacao='" + data_contratacao + '\'' +
                ", salario=" + salario +
                ", beneficio=" + beneficio +
                ", cargo=" + cargo +
                ", vendas=" + vendas +
                '}';
    }
}
