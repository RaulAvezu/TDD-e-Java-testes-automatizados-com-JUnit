package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raul Avezu", LocalDate.now(), new BigDecimal("25000")));

		assertEquals(BigDecimal.ZERO, bonus);
	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raul Avezu", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.0"), bonus);
	}

	@Test
	void BonusDeveriaSer10PorCentroParaSalarioDeExatamente10000() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Raul Avezu", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.0"), bonus);
	}

}
