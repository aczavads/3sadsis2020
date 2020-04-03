package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCarro {

	@Test
	void testarConsumo() {
		Carro palioABC3333 = new Carro();
		Carro golAGJ1234 = new Carro();
		
		assertTrue(palioABC3333.isDesligado());
		assertTrue(golAGJ1234.isDesligado());
		
		palioABC3333.abastecer(10.00);
		golAGJ1234.abastecer(25.00);
		
		palioABC3333.ligar();
		assertEquals(9.75, palioABC3333.getCombustivelNoTanqueEmLitros());
		
		golAGJ1234.ligar();
		assertEquals(24.75, golAGJ1234.getCombustivelNoTanqueEmLitros());	
		
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		palioABC3333.acelerar();
		assertEquals(9.00, palioABC3333.getCombustivelNoTanqueEmLitros());
		
		golAGJ1234.acelerar();
		assertEquals(24.50, golAGJ1234.getCombustivelNoTanqueEmLitros());
	}

	@Test
	void testarSeAoAbastecerAumentaQuantidadeNoTanque() {
		Carro kombiAAA1313 = new Carro();		
		assertEquals(0.00, kombiAAA1313.getCombustivelNoTanqueEmLitros());
		
		kombiAAA1313.abastecer(25.00);
		assertEquals(25.00, kombiAAA1313.getCombustivelNoTanqueEmLitros());
		
		kombiAAA1313.abastecer(7.50);
		assertEquals(32.50, kombiAAA1313.getCombustivelNoTanqueEmLitros());
	}

	@Test
	void testarDesligaQuandoAcabaCombustivel() {
		Carro kombiAAA1313 = new Carro();				
		kombiAAA1313.abastecer(2);
		
		kombiAAA1313.ligar();
		assertTrue(kombiAAA1313.isLigado());
		
		kombiAAA1313.acelerar();
		kombiAAA1313.acelerar();
		kombiAAA1313.acelerar();
		kombiAAA1313.acelerar();
		kombiAAA1313.acelerar();
		kombiAAA1313.acelerar();
		assertTrue(kombiAAA1313.isLigado());

		kombiAAA1313.acelerar();
		//assertFalse(kombiAAA1313.isLigado());
		assertTrue(kombiAAA1313.isDesligado());
		
		assertEquals(0.00, kombiAAA1313.getCombustivelNoTanqueEmLitros());
	}

	@Test
	void testarLigarQuandoJaEstaLigado() {
		Carro novo = new Carro();
		novo.abastecer(10);
		novo.ligar();		
		novo.ligar();
	}
}





