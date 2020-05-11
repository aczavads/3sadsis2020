package aula20200511.fundamentosColeções;

import java.util.ArrayList;

public class AppFundamentosArrayList {
	
//	public static void main(String[] args) {
//		ArrayList<String> arrayListDeNomes = new ArrayList<String>();	
//		//[]
//				
//		arrayListDeNomes.add("Ana");
//		arrayListDeNomes.add("Joaquim");
//		//   0        1     
//		//["Ana", "Joaquim"]
//		
//		System.out.println("O ArrayList [arrayListDeNomes] tem tamanho " 
//				+ arrayListDeNomes.size()
//				+ " e armazena " 
//				+ arrayListDeNomes.size() + " elementos");
//	}
	
	public static void main(String[] args) {
		ArrayList<String> arrayListDeNomes = new ArrayList<String>();	
		//[]
		
		for (int i = 0; i < 13; i++) {
			arrayListDeNomes.add(null);
		}
		//  0     1     2     3     4     5     6     7     8     9    10    11    12    13    14
		//[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
		
		arrayListDeNomes.add(0, "Ana");
		arrayListDeNomes.add(7,"Joaquim");
		//  0     1     2     3     4     5     6         7       8     9    10    11    12    13    14
		//["Ana", null, null, null, null, null, null, "Joaquim", null, null, null, null, null, null, null]
		
		int contador = 0;
		for (String nome : arrayListDeNomes) {
			if (nome != null) {
				contador++;
			}
		}
		System.out.println("O ArrayList [arrayListDeNomes] tem tamanho " 
				+ arrayListDeNomes.size()
				+ " e armazena " 
				+ contador + " elementos");
	}

}
