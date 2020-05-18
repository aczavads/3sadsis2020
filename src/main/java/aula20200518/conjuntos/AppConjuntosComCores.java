package aula20200518.conjuntos;

import java.util.ArrayList;
import java.util.HashSet;

public class AppConjuntosComCores {
	
	public static void main(String[] args) {
		Cor azul = new Cor("Azul");
		
		ArrayList<Cor> listaDeCores = new ArrayList<>();
		listaDeCores.add(new Cor("Roxo"));
		listaDeCores.add(new Cor("Roxo"));
		listaDeCores.add(new Cor("Roxo"));
		listaDeCores.add(new Cor("Roxo"));
		listaDeCores.add(new Cor("Roxo"));		
		System.out.println("O tamanho da lista de cores é: " + listaDeCores.size());
		
		HashSet<Cor> conjuntoDeCores = new HashSet<>();
		conjuntoDeCores.add(new Cor("Roxo"));
		conjuntoDeCores.add(new Cor("Roxo"));
		conjuntoDeCores.add(new Cor("Roxo"));
		conjuntoDeCores.add(new Cor("Roxo"));
		conjuntoDeCores.add(new Cor("Roxo"));		
		System.out.println("O tamanho do conjunto de cores é: " + conjuntoDeCores.size());
	}
}
