package aula20200306.buscas;

import java.util.Arrays;

public class App {
	//main
	public static void main(String[] args) {
		//sysout
		System.out.println("Opa!");

		boolean teste1 = true;
		boolean teste2 = false;
		
		double[] alturas = {1.80, 1.75, 1.59, 1.62, 1.99, 1.49, 1.55, 2.00};
		System.out.println("Existe alguém com 1.59? " + existeValor(alturas, 1.59));
		System.out.println("Existe alguém com 2.01? " + existeValor(alturas, 2.01));
		System.out.println("Existe alguém com 1.99? " + existeValor(alturas, 1.99));	
		//System.out.println(Arrays.stream(alturas).filter(v -> v == 1.99).count() > 0);		
		
		/*
		String x = "xis";
		boolean iguais = x.equals("xis");
		System.out.println(iguais);
		
		System.out.println(x.equals("dfafadsf"));
		System.out.println(x.equals("Brasil"));
		System.out.println(x.equals(x));
		System.out.println(x.equals("Xis"));
		System.out.println(x.equalsIgnoreCase("Xis"));
		System.out.println("teste".equals("teste"));
		
		int valor = 10 + 90;
		System.out.println(valor);
		*/
		String[] nomes = {"Ana","Marina","Eliza","Inês","João","Jonas", "Fernando"};
		System.out.println("Existe o nome Fernando? " + existeValor(nomes, "Fernando"));
		System.out.println("Existe o nome Beatriz? "  + existeValor(nomes, "Beatriz"));
		System.out.println("Existe o nome Ana? "      + existeValor(nomes, "Ana"));
		
		System.out.println("xis".toUpperCase());
		
		String[] nomesEmMaiusculas = transformarEmMaiusculas(nomes);
		System.out.println("nomes................");
		for (String nome : nomesEmMaiusculas) {
			System.out.println(nome);
		}
	}	
	public static String[] transformarEmMaiusculas(String[] valores) {
		//String[] novoArray = valores;
		String[] novoArray = new String[valores.length];
		for (int i = 0; i<valores.length; i++) {
			novoArray[i] = valores[i].toUpperCase();
		}
		return novoArray;
 	}
	
	public static boolean existeValor(String[] valores, String valor) {
		for (int i = 0; i < valores.length; i++) {
			//if (valores[i] == valor) {
			if (valores[i].equals(valor)) {
				return true;
			}
		}
		return false;
	}
	public static boolean existeValor(double[] valores, double valor) {
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == valor) {
				return true;
			}
		}
		return false;
	}
}

