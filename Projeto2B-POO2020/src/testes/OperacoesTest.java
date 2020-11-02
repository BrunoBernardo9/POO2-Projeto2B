package testes;
import static org.junit.Assert.assertEquals;
/* teste commit */
import org.junit.jupiter.api.Test;

import main.Operacoes;

class OperacoesTest {
	
	/*
	 * Faz o teste da multiplicação de fração 
	 * Verificando se o numerador da primeira fração está multiplicando com o numerador da segunda fração
	 * E se o denominador da primeira fração está multiplicando com o denominador da segunda fração.
	 */
	@Test
	void testeMultiplicaFracao() {
		Operacoes op = new Operacoes();
		
		String resultado = op.multiplicaFracao(1, 2, 2, 1);

		assertEquals(2 + "/" + 2, resultado);
	}

	/*
	 * Faz o teste da divisão de fração 
	 * Na divisão de frações a regra é a seguinte:
	 * 1.º O numerador da primeira fração multiplica o denominador da segunda;
     * 2.º O denominador da primeira fração multiplica o numerador da outra fração.
	 */
	@Test
	void testeDivideFracao() {
		Operacoes op = new Operacoes();
		
		String resultado = op.divideFracao(1, 1, 2, 1);

		assertEquals(1 + "/" + 2, resultado);
	}
	
	/*
	 * Faz o teste da soma de fração 
	 * Na soma de frações a regra é a seguinte:
	 * somando-se os numeradores, conforme a operação. Quanto aos denominadores, desde que sejam iguais, mantêm a mesma base.
	 * Caso o denominador seja diferente, é necessário efetuar o MMC entre eles.
	 */
	@Test
	void testeSomaFracao() {
		Operacoes op = new Operacoes();
		
		String resultado = op.somaFracao(1, 1, 2, 2);

		assertEquals(3 + "/" + 2, resultado);
	}
	
	/*
	 * Faz o teste da subtração de fração 
	 * Na subtração de frações a regra é a seguinte:
	 * subtraindo os numeradores, conforme a operação. Quanto aos denominadores, desde que sejam iguais, mantêm a mesma base.
	 * Caso o denominador seja diferente, é necessário efetuar o MMC entre eles.
	 */
	@Test
	void testeSubtraiFracao() {
		Operacoes op = new Operacoes();
		
		String resultado = op.subtraiFracao(1, 1, 2, 3);

		assertEquals(-1 + "/" + 3, resultado);
	}
	
	/*
	 * Classe de teste para calculo de IMC
	 * Fórmula: Peso / (Altura * Altura)
	 */
	@Test
	void testeIMC() {
		Operacoes op = new Operacoes();
		
		double resultado = op.imc(1.72, 80.0);

		assertEquals(27.04, resultado, 0.01);
	}
	
	/*
	 * Conversão de Celsius para Kelvin
	 * Fórmula: K = C + 273.15
	 */
	@Test
	void testeCelsiusToKelvin() {
		Operacoes op = new Operacoes();
		
		double resultado = op.celsiusToKelvin(32.5);

		assertEquals(305.65, resultado, 0.01);
	}
	
	/*
	 * Conversão de Celsius para Fahrenheit
	 * Fórmula: F = (C * 1.8) + 32.00
	 */
	@Test
	void testeCelsiusToFahrenheit() {
		Operacoes op = new Operacoes();
		
		double resultado = op.celsiusToFahrenheit(32.5);

		assertEquals(90.50, resultado, 0.01);
	}
	
	/*
	 * Conversão de Kelvin para Celsius
	 * Fórmula: C = K - 273.15
	 */
	@Test
	void testeKelvinToCelsius() {
		Operacoes op = new Operacoes();
		
		double resultado = op.kelvinToCelsius(32.5);

		assertEquals(-240.65, resultado, 0.01);
	}
	
	/*
	 * Conversão de Kelvin para Fahrenheit
	 * Fórmula: F = (K − 273,15) × 1,80 + 32
	 */
	@Test
	void testeKelvinToFahrenheit() {
		Operacoes op = new Operacoes();
		
		double resultado = op.kelvinToFahrenheit(32.5);

		assertEquals(-401.17, resultado, 0.01);
	}
	
	/*
	 * Conversão de Fahrenheit para Celsius
	 * Fórmula: C = (F − 32.00) * 1.80
	 */
	@Test
	void testeFahrenheitToCelsius() {
		Operacoes op = new Operacoes();
		
		double resultado = op.fahrenheitToCelsius(32.5);

		assertEquals(0.90, resultado, 0.01);
	}
	
	/*
	 * Conversão de Fahrenheit para Kelvin
	 * Fórmula: K = (F − 32) × 1,80 + 273,15
	 */
	@Test
	void testeFahrenheitToKelvin() {
		Operacoes op = new Operacoes();
		
		double resultado = op.fahrenheitToKelvin(32.5);

		assertEquals(274.05, resultado, 0.01);
	}
}
