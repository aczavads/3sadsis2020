package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void testarAberturaEFechamento() {
		Cofre daSala = new Cofre();		
		//assertEquals(false, daSala.isAberto());
		assertFalse(daSala.isAberto());
		
		daSala.abrir();
		//assertEquals(true, daSala.isAberto());
		assertTrue(daSala.isAberto());
		
		daSala.fechar();
		//assertEquals(false, daSala.isAberto());
		assertFalse(daSala.isAberto());
		
				
		Cofre doQuarto = new Cofre();
		assertFalse(doQuarto.isAberto());
		
		
		doQuarto.abrir();
		assertTrue(doQuarto.isAberto());
		
		doQuarto.fechar();
		assertFalse(doQuarto.isAberto());
	}
	
	@Test
	void testarCofreSeguro() {
		CofreSeguro daSala = new CofreSeguro(54321);
		
		assertFalse(daSala.isAberto());
		
		daSala.abrir(123);
		assertFalse(daSala.isAberto());
		
		daSala.abrir(54321);
		assertTrue(daSala.isAberto());

	}


}



















