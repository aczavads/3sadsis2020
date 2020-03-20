package aula20200320.testesGerais;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {

	@Test
	void testarSomaDeDoisInteiros() {
		int valor1 = 100;
		int valor2 = 300;
		int total = valor1+valor2;
		
		assertEquals(400, total);
	}
	
	@Test
	void testarSubtracaoDeDoisInteiros() {
		int valor1 = 100;
		int valor2 = 300;
		int total = valor1-valor2;
		
		assertEquals(-200, total);
	}
	
	@Test 
	void testarComissaoDoVendedor() {
		double valorDaVenda = 5000.00;
		double percentualDeComissao = 10.00;
		double valorDaComissao = GerenciadorDeComissao.calcularComissaoPadrao(valorDaVenda, percentualDeComissao);
		
		assertEquals(500.00, valorDaComissao);
		
		valorDaVenda = 1000.00;
		percentualDeComissao = 3.00;
		valorDaComissao = GerenciadorDeComissao.calcularComissaoPadrao(valorDaVenda, percentualDeComissao);
		
		assertEquals(30.00, valorDaComissao);
	}
	
	@Test 
	void testarComissaoDoVendedorComValorMinimo() {
		final double valorMinimo = 100.00;
		
		double valorDaVenda = 5000.00;
		double percentualDeComissao = 10.00;
		double valorDaComissao = GerenciadorDeComissao.calcularComissaoComValorMinimo(valorMinimo, valorDaVenda, percentualDeComissao);
		
		assertEquals(500.00, valorDaComissao);
		
		valorDaVenda = 1000.00;
		percentualDeComissao = 3.00;
		valorDaComissao = GerenciadorDeComissao.calcularComissaoComValorMinimo(valorMinimo, valorDaVenda, percentualDeComissao);
		
		assertEquals(100.00, valorDaComissao);
	}
	
	@Test 
	void testarComissaoDoVendedorComFaixaDeValores() {
		final double valorMinimo = 80.00;
		final double valorMaximo = 350.00;
		
		double valorDaVenda = 5000.00;
		double percentualDeComissao = 10.00;
		double valorDaComissao = GerenciadorDeComissao.calcularComissaoComFaixa(
				valorMinimo, valorMaximo, valorDaVenda, percentualDeComissao);
		
		assertEquals(valorMaximo, valorDaComissao);
		
		valorDaVenda = 1000.00;
		percentualDeComissao = 3.00;
		valorDaComissao = GerenciadorDeComissao.calcularComissaoComFaixa(
				valorMinimo, valorMaximo, valorDaVenda, percentualDeComissao);
		
		assertEquals(valorMinimo, valorDaComissao);
		
		valorDaVenda = 2000.00;
		percentualDeComissao = 6.00;
		valorDaComissao = GerenciadorDeComissao.calcularComissaoComFaixa(
				valorMinimo, valorMaximo, valorDaVenda, percentualDeComissao);
		
		assertEquals(120.00, valorDaComissao);
		
	}
	

}









