package aula20200313.primeirasClasses;

public class AppLivro {
	
	//+ main(args : String[]) : void 
	//------------------------------    ==> sublinhado, pois se trata de um método estático
	public static void main(String[] args) {
		
		//1º Declaração da variável "bigJava" do tipo Livro: "Livro bigJava"
		//2º Criação de um novo objeto do tipo Livro;
		//   ou
		//   Instanciação de um Livro: "new Livro()"
		//3º Atribuição do novo objeto criado para a variável "bigJava"
		//   ou seja, bigJava é uma REFERÊNCIA para um objeto em memória.
		/*
		Livro bigJava = new Livro();
		bigJava.titulo = "Big Java 5ª Edição";
		bigJava.numeroDePaginas = 471;
		bigJava.nomeDoAutor="Cay Horstmann";
		bigJava.preco=279.80;
		bigJava.nomeDaEditora="John Wiley & Sons";
		biJava.anoDePublicacao=2008;
		*/
		Livro bigJava = new Livro("Big Java 5ª Edição",471,"Cay Horstmann",279.80,"John Wiley & Sons",2008);
		
		Livro bibliaSagrada = null;
		//O código abaixo vai gerar um NullPointerException pois a referência "bibliaSagrada" está nula (null);
		//bibliaSagrada.titulo="Bíblia Sagrada versão King James";
		//bibliaSagrada.numeroDePaginas=2208;
		
		System.out.println("bigJava ===> " + bigJava);
		System.out.println("bibliaSagrada ===> " + bibliaSagrada);
		
	}

}
