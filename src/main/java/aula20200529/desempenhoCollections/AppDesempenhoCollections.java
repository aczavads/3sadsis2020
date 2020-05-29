package aula20200529.desempenhoCollections;

import java.util.ArrayList;


//4.5 segundos
public class AppDesempenhoCollections {
	
	public static void main(String[] args) {
		
		ArrayList<Long> números = new ArrayList<>();
		for (long i = 0; i < 10_000_000; i++) {
			números.add(i);
		}

		long início = System.currentTimeMillis();
		System.out.println("Contém 9_999_999? " + números.contains(9_999_999));
		
		System.out.println("Tamanho da coleção de números: " + números.size());
		
		long término = System.currentTimeMillis();
		System.out.println("Tempo decorrido: " + ((término - início)/1000.0) + " em segundos");
	}

}
