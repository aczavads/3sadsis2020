package aula20200417.excecoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestarExcecoes {

	@Test
	void testarSomaComValoresPositivos() {
		double resultado = AppExcecoes.somarValoresPositivos(2, 2);
		assertEquals(4, resultado);
		
		resultado = AppExcecoes.somarValoresPositivos(10, 25);
		assertEquals(35, resultado);
	}
	@Test
	void testarExcecaoQuandoSomarNegativos() {
		try {
			double resultado = AppExcecoes.somarValoresPositivos(-2, 2);
			fail("Deveria ter gerado uma exceção!");
		} catch (Exception e) {
			//Não faremos nada aqui, pois se gerou uma exceção, está certo!
		}
	}

}
