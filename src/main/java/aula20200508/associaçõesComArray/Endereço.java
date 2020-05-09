package aula20200508.associaçõesComArray;

public class Endereço {
	private String logradouro;
	private String número;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getNúmero() {
		return número;
	}

	public Endereço(String logradouro, String número) {
		this.logradouro = logradouro;
		this.número = número;
	}
}
