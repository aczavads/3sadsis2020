package aula20200619.herança;

import java.util.Date;

public class Artigo extends Publicação {

	public Artigo(String título, Date dataDePublicação, int númeroDePáginas, Autor[] autores) {
		super(título, dataDePublicação, númeroDePáginas, autores);
	}

}
