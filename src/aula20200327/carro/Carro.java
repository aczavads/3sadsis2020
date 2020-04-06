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
	
	//+ esvaziarTanque() : void
	public void esvaziarTanque() {
		combustivelNoTanqueEmLitros = 0.00;
	}
	
	//+ abastecer(volumeEmLitros : double) : void
	public void abastecer(double volumeEmLitros) {
		//this.combustivelNoTanqueEmLitros = this.combustivelNoTanqueEmLitros + volumeEmLitros;
		combustivelNoTanqueEmLitros += volumeEmLitros;
	}
	//+ ligar() : void
	public void ligar() {
		if (isLigado()) {
			//return;
			throw new RuntimeException("O carro já está ligado, você não pode ligá-lo novamente!");
		}
		if (combustivelNoTanqueEmLitros - COMSUMO >= 0.00) {
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
		if (combustivelNoTanqueEmLitros - COMSUMO >= 0.00) {
			combustivelNoTanqueEmLitros -= COMSUMO;
		} 
		if (combustivelNoTanqueEmLitros == 0.00) {
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









