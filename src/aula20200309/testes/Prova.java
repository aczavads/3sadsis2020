package aula20200309.testes;

public class Prova {
	
	public static double[] dobrarAlturas(double[] alturas) {
		double[] retorno = new double[alturas.length];
		
		for(int i = 0; i<alturas.length; i++) {
			retorno[i] = alturas[i] * 2;
		}
		
		return retorno;
	}
	public static double somarValores(double[] valores) {
		double retorno = 0.00;
		for(int i = 0; i<valores.length; i++) {
			retorno += valores[i];
		}
		return retorno;
	}

}
