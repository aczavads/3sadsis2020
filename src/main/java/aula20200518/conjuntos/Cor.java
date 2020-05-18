package aula20200518.conjuntos;

public class Cor {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public Cor(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object outro) {
		//instanceof determina se uma referência aponta para um objeto de determinado tipo,
		//no caso, se a referência "outro" aponta para um objeto cujo tipo seja "Cor".
		if (outro instanceof Cor) {
			//Type casting (ou coerção de tipos) força que a referência assuma um novo tipo, 
			//no caso, a referência "outro" que é do tipo Object vai assumir o tipo "Cor", que está entre parênteses."
			//Se "outro" não apontar para um objeto do tipo "Cor", uma exceção "ClassCastException" será lançada.
			String nomeDoOutro = ((Cor) outro).getNome();
			return this.nome.equals(nomeDoOutro);
		}
		return false;
	}

}
