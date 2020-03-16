package aula202003016.primeirasClasses;

public class AppPessoa {
	
	//+ main(args : String[]) : void
	//------------------------------    ==> o sublinhado na UML determina que o método é STATIC em Java.
	
	/**
	 * Construir duas pessoas com seus respectivos nome e idade e, em seguida, 
	 * imprimir ambas as pessoas no console.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa primeira = new Pessoa("Fulano de Tal", 22);
		Pessoa segunda = new Pessoa("Ana Beatriz", 21);
		
		System.out.println(primeira.nome + "  " + primeira.idade);
		System.out.println(segunda.nome + "  " + segunda.idade);
		
	}

}
