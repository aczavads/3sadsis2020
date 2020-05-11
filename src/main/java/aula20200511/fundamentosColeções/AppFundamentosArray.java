package aula20200511.fundamentosColeções;

public class AppFundamentosArray {
	
	public static void main(String[] args) {
		//String[] arrayDeNomes = {};
		//String[] arrayDeNomes = new String[0];
		String[] arrayDeNomes = new String[15];
		//  0     1     2     3     4     5     6     7     8     9    10    11    12    13    14
		//[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
		
		arrayDeNomes[0] = "Ana";
		arrayDeNomes[7] = "Joaquim";
		//  0     1     2     3     4     5     6         7       8     9    10    11    12    13    14
		//["Ana", null, null, null, null, null, null, "Joaquim", null, null, null, null, null, null, null]
		
		//arrayDeNomes[7] = null;
		
		int contador = 0;
		for (String nome : arrayDeNomes) {
			if (nome != null) {
				contador++;
			}
		}
		System.out.println("O array [arrayDeNomes] tem tamanho " 
				+ arrayDeNomes.length 
				+ " e armazena " 
				+ contador + " elementos");
		
		
	}

}
