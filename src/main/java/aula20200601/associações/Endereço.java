package aula20200601.associações;

import java.util.ArrayList;

public class Endereço {
	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private String número;
	private ArrayList<Pessoa> moradores = new ArrayList<>();

	public Endereço(TipoLogradouro tl, String l, String n) {
		tipoLogradouro = tl;
		logradouro = l;
		número = n;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public String getNúmero() {
		return número;
	}
	public ArrayList<Pessoa> getMoradores() {
		return moradores;
	}
	public void addMorador(Pessoa p) {
//		if (this.moradores.contains(p)) {
//			return;
//		}
		System.out.println("Adicionando novo morador ao endereço: " + p.toString());
		this.moradores.add(p);
		p.addEndereço(this);
	}
	@Override
	public String toString() {
		return "Endereço [tipoLogradouro=" + tipoLogradouro + ", logradouro=" + logradouro + ", número=" + número + "]";
	}
	
}



