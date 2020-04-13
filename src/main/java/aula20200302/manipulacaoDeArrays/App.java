package aula20200302.manipulacaoDeArrays;

public class App {

	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			System.out.println("Olá!");
		}
		int[] valores = {10,20,30,40,50,50,50,10,12,15,33};
		int tamanhoDoArray = valores.length;
		double media = calcularMedia(valores);
		System.out.println(media);
		
		int soma = somarValores(valores);
		System.out.println(soma);
		
		int[] valoresDobrados = dobrarValores(valores);
		//int[] novoArray = new int[outroArray.length];

		int somaDobrada = somarValores(valoresDobrados);
		System.out.println(somaDobrada);
	}
	
	public static int[] dobrarValores(int[] valores) {
		int[] novoArray = new int[valores.length];
		for (int i = 0; i < valores.length; i++) {
			novoArray[i] = valores[i] * 2;
		}
		return novoArray;
	}
	
	public static int somarValores(int[] valores) {
		int soma = 0;
		for (int i = 0; i<valores.length; i++) {
			soma = soma + valores[i];
		}
		return soma;
	}
	
	public static double calcularMedia(int[] valores) {
		return somarValores(valores) / valores.length;
	}
	
}
