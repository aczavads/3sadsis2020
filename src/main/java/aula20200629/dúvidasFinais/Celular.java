package aula20200629.dúvidasFinais;

import java.util.Random;

public class Celular {

	private long númeroDeSérie;
	private String fabricante;
	private String modelo;

	public Celular(long númeroDeSérie, String fabricante, String modelo) {
		this.númeroDeSérie = númeroDeSérie;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public long getNúmeroDeSérie() {
		return númeroDeSérie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}
	
	
	@Override
	public int hashCode() {
		return new Long(númeroDeSérie).hashCode();
//		Random r = new Random();
//		return (int) (r.nextInt() * System.currentTimeMillis());
	}
	
	public boolean equals(Object outro) {
		if (outro == null) {
			return false;
		}
		if (!(outro instanceof Celular)) {
			return false;
		}
		Celular auxOutro = (Celular) outro;
		if (this.númeroDeSérie == auxOutro.númeroDeSérie) {
			return true;
		}
		return false;
	}

}


