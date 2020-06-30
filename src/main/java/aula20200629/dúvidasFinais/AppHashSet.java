package aula20200629.dúvidasFinais;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppHashSet {

	public static void main(String[] args) {
		List<Celular> listaDeCelulares = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			listaDeCelulares.add(new Celular(112554L, "Samsung", "Galaxy S9"));
		}
		System.out.println("tamanho da lista: " + listaDeCelulares.size());
		
		Set<Celular> conjuntoDeCelulares = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			conjuntoDeCelulares.add(new Celular(112554L, "Samsung", "Galaxy S9"));
		}
		System.out.println("tamanho do conjunto: " + conjuntoDeCelulares.size());

	} 

}
