package aula20200529.localidadesAssocBidirecional;

import java.util.ArrayList;

public class País {
	private String nome;
	private ArrayList<Estado> estados = new ArrayList<>();
	
	public País(String nome) {
		this.nome = nome;
	}
	
	public void addEstado(Estado e) {
		this.estados.add(e);
	}
	
	public void removeEstado(Estado e) {
		this.estados.remove(e);
		e.setPaís(new País("S E M  P A Í S"));		
	}
	
	public ArrayList<Estado> getEstados() {
		return estados;
	}
	
	public String getNome() {
		return nome;
	}
}
