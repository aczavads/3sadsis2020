package aula20200629.dúvidasFinais;

public class Pipa extends Brinquedo implements CoisaQueDecola, CoisaQuePousa {
	
	public void decolar() {
		System.out.println("Pipa decolando...");
	}
	
	public void pousar() {
		System.out.println("Pipa pousando...");
	}


}
