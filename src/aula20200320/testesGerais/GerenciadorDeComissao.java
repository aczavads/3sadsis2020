package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}

}


public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
		double padrao = valorDaVenda * (percentualDeComissao/100);
		
		if (padrao < valorMinimo) {
			return valorMinimo;
		}
		return padrao;
	}
public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
		double padrao = valorDaVenda * (percentualDeComissao/100);
		
		if (padrao < valorMinimo) {
			return valorMinimo;
		}
		return padrao;
	}
public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		double padrao = valorDaVenda * (percentualDeComissao/100);
		
		if (padrao < valorMinimo) {
			return valorMinimo;
		}
		if (padrao > valorMaximo) {
			return valorMaximo;
		}
		return padrao;
	}

