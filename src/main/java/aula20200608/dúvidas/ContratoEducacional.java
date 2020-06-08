package aula20200608.dúvidas;

import java.util.HashSet;

public class ContratoEducacional {
	private Pessoa contratante;
	private HashSet<Pessoa> avalistas = new HashSet<>(); 

	public ContratoEducacional(Pessoa contratante, Pessoa[] avalistas) {
		if (contratante == null) {
			throw new RuntimeException("O contrato exige um contratante!");
		}
		this.contratante = contratante;
		
		if (avalistas == null) {
			throw new RuntimeException("O contrato exige entre 1 e 4 avalistas!");			
		}
		for (Pessoa avalista : avalistas) {
			this.avalistas.add(avalista);
		}
//		if (this.avalistas.size() == 0) {
//			throw new RuntimeException("O contrato exige entre 1 e 4 avalistas!");			
//		}
		
	}
	public Pessoa getContratante() {
		return contratante;
	}
	public HashSet<Pessoa> getAvalistas() {
		return avalistas;
	}

}
