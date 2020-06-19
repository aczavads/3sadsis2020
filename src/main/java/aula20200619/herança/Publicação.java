package aula20200619.herança;

import java.util.Date;
import java.util.HashSet;

public abstract class Publicação {
	private String título;
	private Date dataDePublicação;
	private int númeroDePáginas;
	private HashSet<Autor> autores = new HashSet<>();
	

	public Publicação(String título, Date dataDePublicação, int númeroDePáginas, Autor[] autores) {
		this.título = título;
		this.dataDePublicação = dataDePublicação;
		this.númeroDePáginas = númeroDePáginas;
		for (Autor a : autores) {
			this.autores.add(a);
			a.addPublicação(this);
		}
	}
	
	public HashSet<Autor> getAutores() {
		return autores;
	}

	public String getTítulo() {
		return título;
	}

	public Date getDataDePublicação() {
		return dataDePublicação;
	}

	public int getNúmeroDePáginas() {
		return númeroDePáginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDePublicação == null) ? 0 : dataDePublicação.hashCode());
		result = prime * result + ((título == null) ? 0 : título.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicação other = (Publicação) obj;
		if (dataDePublicação == null) {
			if (other.dataDePublicação != null)
				return false;
		} else if (!dataDePublicação.equals(other.dataDePublicação))
			return false;
		if (título == null) {
			if (other.título != null)
				return false;
		} else if (!título.equals(other.título))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + " [título=" + título + ", dataDePublicação=" + dataDePublicação + ", númeroDePáginas="
				+ númeroDePáginas + ", autores=" + autores + "]";
	}
	
	

}
