package aula20200608.dúvidas;

public class AppDúvidas {
	
	public static void main(String[] args) {
		
		Pessoa aluna = new Pessoa("Ana Paula");
		Pessoa avalista1 = new Pessoa("Joaquim");
		Pessoa avalista2 = new Pessoa("Joana");
		
		Pessoa[] avalistas = {avalista1, avalista2, avalista2, avalista2};
		
		ContratoEducacional contratoDaAna = new ContratoEducacional(aluna, avalistas);
		
		System.out.println("contratante...");
		System.out.println(contratoDaAna.getContratante().getNome());
		System.out.println("avalistas...");
		for (Pessoa avalista : contratoDaAna.getAvalistas()) {
			System.out.println("  " + avalista.getNome());
		}
		
		
	}

}
