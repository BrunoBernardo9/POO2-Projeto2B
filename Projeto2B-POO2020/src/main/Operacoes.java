package main;
public class Operacoes {
	
	/*
	 *  Calculadora de Frações
	 */

    /*
     * Algoritmo de Euclides iterativo
     */
    public static int mdc(int denominador1, int denominador2){
        while(denominador2 != 0){
            int r = denominador1 % denominador2;
            denominador1 = denominador2;
            denominador2 = r;
        }
        return denominador1;
    }
	
	/*
	 *  Mínimo múltiplo Comum (MMC)
	 */
	public int mmc(int denominador1, int denominador2) {
		
		return denominador1 * (denominador2 / mdc(denominador1, denominador2));

	}

	/*
	 * Multiplicação de fração
	 */
	public String multiplicaFracao(int numerador1, int denominador1, int numerador2, int denominador2) {
		
		String result = numerador1*numerador2 + "/" + denominador1*denominador2;
		
		return result;
		
	}
	
	/*
	 * Divisão de fração
	 * 
	 */
	public String divideFracao(int numerador1, int denominador1, int numerador2, int denominador2) {
		
		String result = numerador1*denominador2 + "/" + denominador1*numerador2;
		
		return result;
		
	}
	
	/*
	 * Soma de fração
	 */
	public String somaFracao(int numerador1, int denominador1, int numerador2, int denominador2) {
		int denominadorFinal = 1;
		
		if(denominador1 != denominador2) {
			denominadorFinal = mmc(denominador1, denominador2);
		} else {
			denominadorFinal = denominador1;
		}
		
		
		String result = numerador1 + numerador2 + "/" + denominadorFinal;
		
		return result;
		
	}
	

	/*
	 * Subtração
	 */
	public String subtraiFracao(int numerador1, int denominador1, int numerador2, int denominador2) {
		int denominadorFinal = 1;
		
		if(denominador1 != denominador2) {
			denominadorFinal = mmc(denominador1, denominador2);
		} else {
			denominadorFinal = denominador1;
		}
		
		
		String result = numerador1 - numerador2 + "/" + denominadorFinal;
		
		return result;
		
	}
	

	/*
	 *  Calculadora de IMC
	 */
	public double imc(double altura, double massa) {
		return (massa / (altura * altura));
	}


	/*
	 *  Calculadora de Conversão de Escalas Termométricas
	 */
	
	/*
	 * Conversão de Celsius para Kelvin
	 * Fórmula: K = C + 273.15
	 */
	public double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}
	
	/*
	 * Conversão de Celsius para Fahrenheit
	 * Fórmula: F = (C * 1.8) + 32.00
	 */
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 1.80) + 32.00;
	}
	
	/*
	 * Conversão de Kelvin para Celsius
	 * Fórmula: C = K - 273.15
	 */
	public double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	/*
	 * Conversão de Kelvin para Fahrenheit
	 * Fórmula: F = (K − 273,15) * 1,80 + 32,00
	 */
	public double kelvinToFahrenheit(double kelvin) {
		return (kelvin - 273.15) * 1.80 + 32.00;
	}
	
	/*
	 * Conversão de Fahrenheit para Celsius
	 * Fórmula: C = (F − 32.00) * 1.80
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32.00) * 1.80;
	}
	
	/*
	 * Conversão de Fahrenheit para Kelvin
	 * Fórmula: K = (F − 32) × 1,80 + 273,15
	 */
	public double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit - 32.00) * 1.80 + 273.15;
	}

}