package aula20200508.associaçõesComArray;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	//private Endereço[] endereços = new Endereço[5];
	private ArrayList<Endereço> endereços = new ArrayList();
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void adicionarEndereço(Endereço e) {
		this.endereços.add(e);
	}
	public ArrayList<Endereço> getEndereços() {
		return this.endereços;
	}
//	public Endereço[] getEndereços() {
//		return this.endereços;
//	}

}




