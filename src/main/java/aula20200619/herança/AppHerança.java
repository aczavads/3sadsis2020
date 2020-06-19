package aula20200619.herança;

import java.util.Date;

public class AppHerança {
	
	public static void main(String[] args) {
		Autor joaquim = new Autor("Joaquim Alamamanda Junior", "654.878.436-44");
		Autor joana = new Autor("Joana Alamamanda Junior", "654.878.436-44");
		
		
		
		Publicação assandoPães = new Livro(
				"Assando Pães na Panela de Ferro",new Date(2020, 0, 23), 664, new Autor[] {joaquim, joana});
		
		Publicação pãoCaseiro = new Livro(
				"Aprenda a fazer pão caseiro em 21 horas",new Date(2010, 11, 15), 121, new Autor[] {joaquim});
		
		Publicação panificação2020 = new Artigo(
				"Técnicas atuais de panificação caseira",new Date(2020, 3, 15), 200, new Autor[] {joaquim, joana}); 
		
		//System.out.println(assandoPães.toString());
		//System.out.println(assandoPães);
		
		imprimirPublicaçõesDoAutorNoConsole(joaquim);
		imprimirPublicaçõesDoAutorNoConsole(joana);
		
	}
	private static void imprimirPublicaçõesDoAutorNoConsole(Autor autorQualquer) {
		System.out.println();
		System.out.println("**************************");
		System.out.println("Publicações de: " + autorQualquer);
		System.out.println("Resumo: Livros=" + autorQualquer.contarLivros() + ", Artigos="+autorQualquer.contarArtigos());
		for (Publicação p : autorQualquer.getPublicações()) {
			System.out.println("  " + p);
		}
	}

}
