import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Venda> lista_vendas_ana = Arrays.asList(
                new Venda(12,2021, 5200.00),
                new Venda(01,2022, 4000.00),
                new Venda(02,2022, 4200.00),
                new Venda(03,2022, 5850.00),
                new Venda(04,2022, 7000.00)
        );

        List<Venda> lista_vendas_joao = Arrays.asList(
                new Venda(12,2021, 3400.00),
                new Venda(01,2022, 7700.00),
                new Venda(02,2022, 5000.00),
                new Venda(03,2022, 5900.00),
                new Venda(04,2022, 6500.00)
        );

        List<Funcionario> funcionarios_todos = Arrays.asList(
                new Funcionario("Jorge Carvalho", 01,2018, Cargo.secretario),
                new Funcionario("Maria Souza", 12,2015, Cargo.secretario),
                new Funcionario("Ana Silva", 12,2021, Cargo.vendedor, lista_vendas_ana),
                new Funcionario("João Mendes", 12,2021, Cargo.vendedor, lista_vendas_joao),
                new Funcionario("Juliana Alves", 07,2017, Cargo.gerente),
                new Funcionario("Bento Albino", 03,2014, Cargo.gerente)
        );

        List<Funcionario> funcionarios_com_beneficios = Arrays.asList(
                new Funcionario("Jorge Carvalho", 01,2018, Cargo.secretario),
                new Funcionario("Maria Souza", 12,2015, Cargo.secretario),
                new Funcionario("Ana Silva", 12,2021, Cargo.vendedor, lista_vendas_ana),
                new Funcionario("João Mendes", 12,2021, Cargo.vendedor, lista_vendas_joao)
        );

        List<Funcionario> funcionarios_vendedores = Arrays.asList(
                new Funcionario("Ana Silva", 12, 2021, Cargo.vendedor, lista_vendas_ana),
                new Funcionario("João Mendes", 12,2021, Cargo.vendedor, lista_vendas_joao)
        );

        GerenciadorFuncionarios gerenciadorFuncionarios = new GerenciadorFuncionarios();
        gerenciadorFuncionarios.valorTotalMes(funcionarios_todos, 12,2021);
        gerenciadorFuncionarios.valorTotalSalarioMes(funcionarios_todos, 12,2021);
        gerenciadorFuncionarios.valorTotalBeneficioMes(funcionarios_todos, 12,2021);
        gerenciadorFuncionarios.maiorValorFuncionario(funcionarios_todos, 12,2021);
        gerenciadorFuncionarios.maiorValorBeneficioFuncionario(funcionarios_com_beneficios, 12,2021);
        gerenciadorFuncionarios.maiorVendedorDoMes(funcionarios_vendedores, 12, 2021);
    }
}