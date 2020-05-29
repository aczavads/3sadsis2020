package aula20200525.localidades;

import java.util.ArrayList;

public class País {
	private String nome;
	private int códigoDDI;
	private ArrayList<Estado> estados = new ArrayList<>();

	public País(String nome, int códigoDDI) {
		this.nome = nome;
		this.códigoDDI = códigoDDI;
	}
	public String getNome() {
		return nome;
	}
	public int getCódigoDDI() {
		return códigoDDI;
	}
	public void addEstado(Estado e) {
		for (Estado estadoExistente : estados) {
			if (estadoExistente.getSigla().equals(e.getSigla())) {
				return;
			}
		}
		this.estados.add(e);		
	}
	public ArrayList<Estado> getEstados() {
		return estados;
	}
	public int contaEstados() {
		return this.estados.size();
	}

}
