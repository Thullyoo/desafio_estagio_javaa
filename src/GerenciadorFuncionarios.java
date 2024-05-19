import java.util.List;

public class GerenciadorFuncionarios {

    //Variaveis utéis
    Double valorTotal = 0.00;
    String funcionarioComMaiorValor;
    String funcionarioComMaiorBeneficio;
    String maiorVendedor;
    Double maiorVendaNoMes = 0.0;
    Double maiorBeneficioNoMes = 0.0;
    Double maiorValorFuncionarioNoMes = 0.0;

    //metódo que retorna o valor total pago no mês
    public void valorTotalMes(List<Funcionario> funcionarios, int mes, int ano) {
        if (mes > 12 || mes < 1) {
            throw new RuntimeException("Data inválida");
        }
        funcionarios.forEach((funcionario) -> {
            if (funcionario.cargo == Cargo.secretario) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                Double beneficio = salario * 0.20;
                valorTotal += salario + beneficio;
            }

            if (funcionario.cargo == Cargo.vendedor) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                Double beneficio = 0.0;
                for (Venda v : funcionario.vendas) {
                    if (v.getAnovenda() == ano && v.getMesvenda() == mes) {
                        beneficio = v.getValor() * 0.30;
                    }
                }
                valorTotal += salario + beneficio;
            }

            if (funcionario.cargo == Cargo.gerente) {
                Double salario = (3000.00 * (ano - funcionario.getAnocontratacao()) + 20000.00);
                valorTotal += salario;
            }

        });
        System.out.println("Valor total pago na data " + mes + "/" + ano + " foi de R$" + valorTotal);
        valorTotal = 0.0;
    }

    //metodo que retorna valor total pago em salário no mês
    public void valorTotalSalarioMes(List<Funcionario> funcionarios, int mes, int ano) {
        if (mes > 12 || mes < 1) {
            throw new RuntimeException("Data inválida");
        }
        funcionarios.forEach((funcionario) -> {
            if (funcionario.cargo == Cargo.secretario) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                valorTotal += salario;
            }

            if (funcionario.cargo == Cargo.vendedor) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                valorTotal += salario;
            }

            if (funcionario.cargo == Cargo.gerente) {
                Double salario = (3000.00 * (ano - funcionario.getAnocontratacao()) + 20000.00);
                valorTotal += salario;
            }

        });
        System.out.println("Valor total pago de salário na data " + mes + "/" + ano + " foi de R$" + valorTotal);
        valorTotal = 0.0;
    }

    //metodo que retorna valor total pago em Beneficio no mês
    public void valorTotalBeneficioMes(List<Funcionario> funcionarios, int mes, int ano) {
        if (mes > 12 || mes < 1) {
            throw new RuntimeException("Data inválida");
        }
        funcionarios.forEach((funcionario) -> {
            if (funcionario.cargo == Cargo.secretario) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                Double beneficio = salario * 0.20;
                valorTotal += beneficio;
            }

            if (funcionario.cargo == Cargo.vendedor) {
                Double beneficio = 0.0;
                for (Venda v : funcionario.vendas) {
                    if (v.getAnovenda() == ano && v.getMesvenda() == mes) {
                        beneficio = v.getValor() * 0.30;
                    }
                }
                valorTotal += beneficio;
            }

        });
        System.out.println("Valor total pago em beneficios na data " + mes + "/" + ano + " foi de R$" + valorTotal);
        valorTotal = 0.0;
    }

    //metodo que retorna o funcionario que recebeu o maior valor no mês
    public void maiorValorFuncionario(List<Funcionario> funcionarios, int mes, int ano) {
        if (mes > 12 || mes < 1) {
            throw new RuntimeException("Data inválida");
        }
        funcionarios.forEach((funcionario) -> {
            if (funcionario.cargo == Cargo.secretario) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                Double beneficio = salario * 0.20;
                valorTotal += salario + beneficio;
                if (salario + beneficio > maiorValorFuncionarioNoMes) {
                    maiorValorFuncionarioNoMes = salario;
                    funcionarioComMaiorValor = "O funcionário com o maior valor de salário junto com beneficios é o " + funcionario.getNome() + " no cargo de " + funcionario.getCargo() + " com o valor de R$ " + salario + beneficio;
                }
            }

            if (funcionario.cargo == Cargo.vendedor) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                Double beneficio = 0.0;
                for (Venda v : funcionario.vendas) {
                    if (v.getAnovenda() == ano && v.getMesvenda() == mes) {
                        beneficio = v.getValor() * 0.30;
                    }
                }
                valorTotal += salario + beneficio;
                if (salario + beneficio > maiorValorFuncionarioNoMes) {
                    maiorValorFuncionarioNoMes = salario;
                    funcionarioComMaiorValor = "O funcionário com o maior valor de salário junto com beneficios é o " + funcionario.getNome() + " no cargo de " + funcionario.getCargo() + " com o valor de R$ " + salario + beneficio;
                }
            }

            if (funcionario.cargo == Cargo.gerente) {
                Double salario = (3000.00 * (ano - funcionario.getAnocontratacao()) + 20000.00);
                valorTotal += salario;
                if (salario > maiorValorFuncionarioNoMes) {
                    maiorValorFuncionarioNoMes = salario;
                    funcionarioComMaiorValor = "O funcionário com o maior valor de salário junto com beneficios é o " + funcionario.getNome() + " no cargo de " + funcionario.getCargo() + " com o valor de R$ " + salario;
                }
            }

        });
        System.out.println(funcionarioComMaiorValor);
        valorTotal = 0.0;
        funcionarioComMaiorValor = "";
        maiorValorFuncionarioNoMes = 0.0;
    }

    //metodo que retorna o funcionario que recebeu o maior beneficio no mês
    public void maiorValorBeneficioFuncionario(List<Funcionario> funcionarios_contem_beneficios, int mes, int ano) {
        if (mes > 12 || mes < 01) {
            throw new RuntimeException("Data inválida");
        }
        funcionarios_contem_beneficios.forEach((funcionario) -> {
            if (funcionario.cargo == Cargo.secretario) {
                Double salario = (1000.00 * (ano - funcionario.getAnocontratacao()) + 7000.00);
                Double beneficio = salario * 0.20;
                valorTotal += beneficio;
                if (beneficio > maiorBeneficioNoMes) {
                    maiorBeneficioNoMes = beneficio;
                    funcionarioComMaiorBeneficio = "O funcionário com o maior valor de beneficio é o " + funcionario.getNome() + " no cargo de " + funcionario.getCargo() + " com o valor de R$ " + beneficio;
                }
            }

            if (funcionario.cargo == Cargo.vendedor) {
                Double beneficio = 0.0;
                for (Venda v : funcionario.vendas) {
                    if (v.getAnovenda() == ano && v.getMesvenda() == mes) {
                        beneficio = v.getValor() * 0.30;
                    }
                }
                valorTotal += beneficio;
                if (beneficio > maiorBeneficioNoMes) {
                    maiorBeneficioNoMes = beneficio;
                    funcionarioComMaiorBeneficio = "O funcionário com o maior valor de beneficio é o " + funcionario.getNome() + " no cargo de " + funcionario.getCargo() + " com o valor de R$ " + beneficio;
                }
            }

        });
        System.out.println(funcionarioComMaiorBeneficio);
        valorTotal = 0.0;
        maiorBeneficioNoMes = 0.0;
        funcionarioComMaiorBeneficio = "";
    }

    //Metodo que retorna o funcionario com o maior valor em vendas no mês
    public void maiorVendedorDoMes(List<Funcionario> funcionarios_vendedor, int mes, int ano){
        funcionarios_vendedor.forEach((funcionario) -> {
            Double valorVenda = 0.0;
            for (Venda v : funcionario.vendas) {
                        if (v.getAnovenda() == ano && v.getMesvenda() == mes) {
                            valorVenda = v.getValor();
                        }
                    }
                    if ( valorVenda > maiorVendaNoMes) {
                        maiorVendaNoMes = valorVenda;
                        maiorVendedor = "O funcionário com o maior valor de venda no mês é o " + funcionario.getNome() + " no cargo de " + funcionario.getCargo() + " com o valor de R$ " + valorVenda;
                    }
                }
        );
        if (maiorVendaNoMes == 0.0){
            throw new RuntimeException("Data informada inválida");
        } else{
            System.out.println(maiorVendedor);
            maiorVendedor = "";
            maiorVendaNoMes = 0.0;
        }

    }

}



