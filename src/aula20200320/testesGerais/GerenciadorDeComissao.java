package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
		double valorDaComissao = calcularComissaoPadrao(valorDaVenda, percentualDeComissao);
		if (valorDaComissao < valorMinimo) {
			return valorMinimo;
		} 
		return valorDaComissao;		
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		double valorDaComissao = calcularComissaoComValorMinimo(valorMinimo, valorDaVenda, percentualDeComissao);
		if (valorDaComissao > valorMaximo) {
			return valorMaximo;
		}
		return valorDaComissao;
	}


}
