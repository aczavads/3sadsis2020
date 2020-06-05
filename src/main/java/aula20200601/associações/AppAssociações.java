package aula20200601.associações;

import java.util.ArrayList;

public class AppAssociações {
	
	public static void main(String[] args) {
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Jonas");
		nomes.add("Lúcia");
		
		System.out.println("Nomes contém Josias? " + nomes.contains("Josias"));
 		System.out.println("Nomes contém Ana? " + nomes.contains("Ana"));
		*/
		
		
		Endereço avGuedner125 = new Endereço(TipoLogradouro.AVENIDA, "Guedner", "125");
		Endereço ruaBogotá555 = new Endereço(TipoLogradouro.RUA, "Bogotá", "555a");
		
		Pessoa fulano = new Pessoa("Fulano de Tal");
		Pessoa beltrana = new Pessoa("Beltrana de Tal");
		
		fulano.addEndereço(avGuedner125);
		//avGuedner125.addMorador(fulano);
		
		beltrana.addEndereço(avGuedner125);
		//avGuedner125.addMorador(beltrana);
		
		beltrana.addEndereço(ruaBogotá555);
		//ruaBogotá555.addMorador(beltrana);
		
		endereçosDaPessoaNoConsole(fulano);
		endereçosDaPessoaNoConsole(beltrana);
		
		moradoresDoEndereçoNoConsole(avGuedner125);
		
		
	}
	private static void moradoresDoEndereçoNoConsole(Endereço e) {
		System.out.println();
		System.out.println(">>> Moradores do Endereço <<<");
		System.out.println(">>> " + e.toString() );
		System.out.println(">>>");
		for (Pessoa morador : e.getMoradores()) {
			System.out.println(morador.toString());
		}
	}
	
	private static void endereçosDaPessoaNoConsole(Pessoa p) {
		System.out.println();
		System.out.println(">>> Endereços da Pessoa <<<");
		System.out.println(">>> " + p.toString() );
		System.out.println(">>>");
		for (Endereço e : p.getEndereços()) {
			System.out.println(e.toString());
		}
	}

}
