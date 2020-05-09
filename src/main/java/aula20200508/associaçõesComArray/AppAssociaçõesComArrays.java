package aula20200508.associaçõesComArray;

public class AppAssociaçõesComArrays {
	
	public static void main(String[] args) {
		Pessoa ciclano = new Pessoa("Ciclano de Tal", 22);
		
		Endereço casaDoCiclano = new Endereço("Av. Brasil", "425a");
		Endereço escritórioDoCiclano = new Endereço("Av. Guedner", "1225");
		
		ciclano.adicionarEndereço(casaDoCiclano);
		ciclano.adicionarEndereço(escritórioDoCiclano);
		
		System.out.println("Ciclano possui " + ciclano.getEndereços().size() + " endereço(s)");
		
		for (int i = 0; i < ciclano.getEndereços().size(); i++) {
			Endereço e = ciclano.getEndereços().get(i);
			System.out.println(e.getLogradouro() + ", " + e.getNúmero());
		}
	}

}
