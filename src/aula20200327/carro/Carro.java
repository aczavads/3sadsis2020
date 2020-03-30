package aula20200327.carro;

public class Carro {
	private final static double COMSUMO = 0.250;
	//- combustivelNoTanqueEmLitros : double = 0.00
	private double combustivelNoTanqueEmLitros = 0.00;
	
	//- ligado : boolean = false
	private boolean ligado = false;
	
	
	//+ Carro()
	public Carro() {
		//A inicialização dos atributos do objeto podem (ou devem!) ser feitos no construtor.
		combustivelNoTanqueEmLitros = 0.00;
		ligado = false;
	}
	
	//+ abastecer(volumeEmLitros : double) : void
	public void abastecer(double volumeEmLitros) {
		//this.combustivelNoTanqueEmLitros = this.combustivelNoTanqueEmLitros + volumeEmLitros;
		combustivelNoTanqueEmLitros += volumeEmLitros;
	}
	//+ ligar() : void
	public void ligar() {
		if (combustivelNoTanqueEmLitros - COMSUMO > 0.00) {
			ligado = true;
			combustivelNoTanqueEmLitros -= COMSUMO;
		}
	}
	//+ desligar() : void
	public void desligar() {
		ligado = false;
	}
	//+ acelerar() : void
	public void acelerar() {
		if (combustivelNoTanqueEmLitros - COMSUMO > 0.00) {
			combustivelNoTanqueEmLitros -= COMSUMO;
		} else {
			desligar();
		}
	}
	//+ isLigado() : boolean
	public boolean isLigado() {
		return ligado;
	}
	//+ isDesligado() : boolean
	public boolean isDesligado() {
		return !isLigado();
	}
	//+ getCombustivelNoTanqueEmLitros() : double
	public double getCombustivelNoTanqueEmLitros() {
		return combustivelNoTanqueEmLitros;
	}

}









