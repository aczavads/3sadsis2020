package aula20200217.escritaEmConsole;

import org.omg.CORBA.NO_MEMORY;

public class App {
	private static final String NOME_DO_PAIS = "Brasil";

	// + main(args : String[]) : void
	// ----------------------------
	public static void main(String[] args) {
		System.out.println("Hello World! :D");
		System.out.println(somar(20, 30));
		System.out.println(somar(-20, 30));
		System.out.println(dividir(20, 30));
		System.out.println(dividir(-20, 30));
		System.out.println(multiplicar(10, 20, 30));
		System.out.println(multiplicar(10, -20, 30));
		System.out.println(multiplicar(20, 30));
		System.out.println(multiplicar(-20, 30));
		System.out.println("O maior é: " + definirMaior(200, 80));
		System.out.println("O menor é: " + definirMenor(200, 80));
		
		//esse método cria o array do tamanho solicitado contendo a cidade informada em todas as posições
		String[] cidades = criarArrayDeCidades(100, "Maringá"); 
		//esse método imprime as cidades do array no console.
		listarCidades(cidades); 
		
		/*
		String[] nomes = new String[4];
		nomes[2] = "Josias";
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		*/
	}
	private static String[] criarArrayDeCidades(int tamanho, String cidade) {
		String[] arrayDeCidades = new String[tamanho];
		//percorrer o array jogando a cidade recebida por parâmetro para todas as posições do array.
		for (int i = 0; i < arrayDeCidades.length; i++) {
			arrayDeCidades[i] = cidade;
		}
		return arrayDeCidades;
	}
	
	private static void listarCidades(String[] cidades) {
		for (int i = 0; i < cidades.length; i++) {
			System.out.println(cidades[i]);
		}
	}
	
	private static int definirMenor(int v1, int v2) {
		if (v1 < v2) {
			return v1;
		}
		return v2;
	}


	private static int definirMaior(int v1, int v2) {
		if (v1 > v2) {
			return v1;
		}
		return v2;
	}

	// - somar(v1 : double, v2 : double) : double
	// ----------------------------------------
	private static double somar(double v1, double v2) {
		return v1 + v2;
	}

	// - dividir(dividendo : double, divisor : double) : double
	// ------------------------------------------------------
	private static double dividir(double dividendo, double divisor) {
		return dividendo / divisor;
	}

	// - multiplicar(v1 : int, v2 : int, v3 : int) : int
	// -----------------------------------------------
	private static int multiplicar(int v1, int v2, int v3) {
		return v1 * v2 * v3;
	}

	private static int multiplicar(int v1, int v2) {
		int total = 0;
		for (int i = 0; i < v2; i++) {
			total = total + v1;
		}
		return total;
	}
}
