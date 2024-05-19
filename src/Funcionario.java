
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Funcionario {

    String nome;

    Integer mescontratacao;

    Integer anocontratacao;

    Cargo cargo;

    List<Venda> vendas;

    public Funcionario(String nome, int mescontratacao, int anocontratacao, Cargo cargo) {
        this.nome = nome;
        this.mescontratacao = mescontratacao;
        this.cargo = cargo;
        this.anocontratacao = anocontratacao;
    }

    public Funcionario(String nome, int mescontratacao, int anocontratacao, Cargo cargo, List<Venda> vendas) {
        this.nome = nome;
        this.mescontratacao = mescontratacao;
        this.cargo = cargo;
        this.anocontratacao = anocontratacao;
        this.vendas = vendas;
    }

    public Integer getMescontratacao() {
        return mescontratacao;
    }

    public Integer getAnocontratacao() {
        return anocontratacao;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", mescontratacao=" + mescontratacao +
                ", anocontratacao=" + anocontratacao +
                ", cargo=" + cargo +
                ", vendas=" + vendas +
                '}';
    }
}
