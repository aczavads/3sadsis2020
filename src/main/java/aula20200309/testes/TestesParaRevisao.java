package aula20200309.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesParaRevisao {

	@Test
	void testarSoma() {
		int valor1 = 100;
		int valor2 = 200;
		int total = valor1 + valor2;		
		assertEquals(300, total);
	}
	
	@Test
	void testarSomaDaCalculadora() {
		int total1 = Calculadora.somar(100, 200);
		
		assertEquals(300, total1);
		
		int total2 = Calculadora.somar(100, -100);
		
		assertEquals(0, total2);
	}
	
	
	
	@Test
	void dobrarValoresDoArray() {
		double[] alturas1 = {2.00, 1.50, 2.00, 1.50, 1.00, 0.75};
		double[] alturasDobradas1 = Prova.dobrarAlturas(alturas1);
		double alturasSomadas1 = Prova.somarValores(alturasDobradas1);
		
		assertEquals(17.50, alturasSomadas1);
		
		double[] alturas2 = {1.00, 1.00, 2.00, 1.00, 1.00, 1.00};
		double[] alturasDobradas2 = Prova.dobrarAlturas(alturas2);
		double alturasSomadas2 = Prova.somarValores(alturasDobradas2);
		
		assertEquals(14.00, alturasSomadas2);
		
	}
}


