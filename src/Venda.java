public class Venda {

    String datavenda;

    Double valor;

    public Venda(String datavenda, Double valor) {
        this.datavenda = datavenda;
        this.valor = valor;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "datavenda='" + datavenda + '\'' +
                ", valor=" + valor +
                '}';
    }
}
