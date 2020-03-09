package arthur.zavadski;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeirosTestes {

	@Test
	void testarPercentuais() {
		double salario = 2000.00;
		double horasExtras = 100.00;		
		double percentualDeHorasExtras = Calculadora.calcularPercentual(salario, horasExtras);
		assertEquals(5.00, percentualDeHorasExtras);
		
		double valorAtual = 200.00;
		double valorReajustado = 270.00;
		double percentualReajustado = Calculadora.calcularPercentual(valorAtual, valorReajustado);
		assertEquals(135.00, percentualReajustado);
	}
	
	@Test
	void testarTotalDeCaracteres() {
		//String teste = "teste";
		//int tamanhoDoTeste = teste.length();
		
		String[] nomes = {"Ana", "Joana", "Mariana"};
		int totalDeCaracteresNosNomes = Calculadora.contarCaracteresNoArray(nomes);
		
		assertEquals(15, totalDeCaracteresNosNomes);
		
		String[] paises = {"Brasil", "Canada", "Uruguai"};
		int totalDeCaracteresNosPaises = Calculadora.contarCaracteresNoArray(nomes);
		
		assertEquals(19, totalDeCaracteresNosPaises);
	}
	
}



