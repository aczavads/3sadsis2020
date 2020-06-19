package aula20200619.herança;

import java.util.Date;

public class Livro extends Publicação {

	public Livro(String título, Date dataDePublicação, int númeroDePáginas, Autor[] autores) {
		super(título, dataDePublicação, númeroDePáginas, autores);
	}

}
