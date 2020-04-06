package aula20200406.tiposDeMetodos;

public class AppTiposDeMetodos {
	
	public static void main(String[] args) {
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa maria = new Pessoa();
		//maria.nome = "Maria das Graças";
		maria.setNome("Maria das Graças");
		maria.setAltura(1.62);
		maria.setIdade(22);
		maria.setPeso(54);
		
		//DIA
		//Declaração, Instanciação, Atribuição
		Pessoa jose = new Pessoa();
		//jose.nome = "José de Alencar";
		jose.setNome("José de Alencar");
		jose.setAltura(1.75);
		jose.setPeso(-92);
		jose.setIdade(32);
		
		
		System.out.println(maria.getNome() + ", IMC=" + maria.getIMC());
		System.out.println(jose.getNome() + ", IMC=" + jose.getIMC());
		
	}

}
