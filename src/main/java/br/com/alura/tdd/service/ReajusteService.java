package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
			BigDecimal salarioReajustado = desempenho.percentualReajuste().multiply(funcionario.getSalario());
			funcionario.reajustarSalario(salarioReajustado);


	}
}
