package aula20200601.associações;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Endereço> endereços = new ArrayList<>();

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Endereço> getEndereços() {
		return endereços;
	}
	
	public void addEndereço(Endereço e) {
//		if (this.endereços.contains(e)) {
//			return;
//		}
		System.out.println("Adicionando novo endereço à pessoa: " + e.toString());
		this.endereços.add(e);
		e.addMorador(this);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}	
}
