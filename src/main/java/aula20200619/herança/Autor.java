package aula20200619.herança;

import java.util.HashSet;

public class Autor {

	private String nome;
	private String cpf;
	private HashSet<Publicação> publicações = new HashSet<>();

	public Autor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void addPublicação(Publicação p) {
		if (this.publicações.contains(p)) {
			return;
		}
		this.publicações.add(p);		
	}
	public HashSet<Publicação> getPublicações() {
		return publicações;
	}
	
	public int contarLivros() {
		int total = 0; 
		for (Publicação publicação : publicações) {
			if (publicação instanceof Livro) {
				total++;
			}
		}
		return total;
	}

	public int contarArtigos() {
		int total = 0; 
		for (Publicação publicação : publicações) {
			if (publicação instanceof Artigo) {
				total++;
			}
		}
		return total;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Autor other = (Autor) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", cpf=" + cpf + "]";
	}

}
