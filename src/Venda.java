public class Venda {

    Integer mesvenda;
    Integer anovenda;

    Double valor;

    public Venda(Integer mesvenda, Integer anovenda, Double valor) {
        this.mesvenda = mesvenda;
        this.anovenda = anovenda;
        this.valor = valor;
    }

    public Integer getMesvenda() {
        return mesvenda;
    }

    public Integer getAnovenda() {
        return anovenda;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "mesvenda=" + mesvenda +
                ", anovenda=" + anovenda +
                ", valor=" + valor +
                '}';
    }
}
