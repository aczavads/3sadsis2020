//aula20200313.primeirasClasses
package aula20200313.primeirasClasses;

//Livro
public class Livro {
	//+ titulo : String
	public String titulo;
	//+ numeroDePaginas : int
	public int numeroDePaginas;
	//+ anoDePublicacao : int
	public int anoDePublicacao;
	//+ nomeDaEditora : String
	public String nomeDaEditora;
	//+ nomeDoAutor : String
	public String nomeDoAutor;
	//+ preco : double
	public double preco;
	
	
	//new Livro("Big Java 5ª Edição",471,"Cay Horstmann",279.80,"John Wiley & Sons",2008);
	public Livro(String titulo, int numeroDePaginas, String nomeDoAutor, double preco, String nomeDaEditora, int anoDePublicacao) {
		System.out.println("===> Início do construtor da classe Livro...");
		System.out.println(titulo);
		System.out.println(numeroDePaginas);
		System.out.println(nomeDoAutor);
		System.out.println(preco);
		System.out.println(nomeDaEditora);
		System.out.println(anoDePublicacao);
		System.out.println("---");
		System.out.println(this.titulo);
		System.out.println(this.numeroDePaginas);
		System.out.println(this.nomeDoAutor);
		System.out.println(this.preco);
		System.out.println(this.nomeDaEditora);
		System.out.println(this.anoDePublicacao);
		System.out.println("===> Fim do construtor da classe Livro.");
		this.titulo = titulo;
		
	}

}
