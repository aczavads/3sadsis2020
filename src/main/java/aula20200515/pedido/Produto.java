package aula20200515.pedido;

public class Produto {
	//- nome : String
	private String nome;
	
	//+ getNome() : String
	public String getNome() {
		return nome;
	}
	
	//+ Produto(nome : String)
	public Produto(String nome) {
		this.nome = nome;
	}
}
