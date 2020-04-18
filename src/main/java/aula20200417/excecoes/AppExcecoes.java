package aula20200417.excecoes;

public class AppExcecoes {
	
	public static void main(String[] args) {
		try {
			double resultado = somarValoresPositivos(15.25, 10.00);
			System.out.println(resultado);		
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Fim.");
	}
	
	public static double somarValoresPositivos(double v1, double v2) {
		if (v1 < 0.00 || v2 < 0.00) {
			//lance (throw) uma nova exceção do tipo RuntimeException com a mensagem "Valores devem ser positivos!"
			throw new RuntimeException("Valores devem ser positivos!");
		}
		System.out.println("Opa, vai retornar o valor da soma!");
		return v1 + v2;
	}
}
