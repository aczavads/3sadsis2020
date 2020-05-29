package aula20200525.localidades;

public class Estado {

	private String nome;
	private String sigla;
	private int códigoDDD;

	public Estado(String nome, String sigla, int códigoDDD) {
		this.nome = nome;
		this.sigla = sigla;
		this.códigoDDD = códigoDDD;
	}
	
	public int getCódigoDDD() {
		return códigoDDD;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}

}
