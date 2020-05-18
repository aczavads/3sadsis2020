package aula20200518.conjuntos;

import java.util.ArrayList;
import java.util.HashSet;

public class AppConjuntosComNomes {
	
	public static void main(String[] args) {
		ArrayList<String> listaDeNomes = new ArrayList<>();
		listaDeNomes.add("Sofia");
		listaDeNomes.add("Sofia");
		listaDeNomes.add("Sofia");
		listaDeNomes.add("Sofia");
		listaDeNomes.add("Sofia");
		
		System.out.println("Tamanho da lista de nomes: " + listaDeNomes.size());
		for (String nome : listaDeNomes) {
			System.out.println(nome);
		}
		
		HashSet<String> conjuntoDeNomes = new HashSet<>();
		conjuntoDeNomes.add("Sofia");
		conjuntoDeNomes.add("Sofia");
		conjuntoDeNomes.add("Sofia");
		conjuntoDeNomes.add("Sofia");
		conjuntoDeNomes.add("Sofia");
		
		System.out.println("Tamanho do conjunto de nomes: " + conjuntoDeNomes.size());
		for (String nome : conjuntoDeNomes) {
			System.out.println(nome);
		}
	}
}
