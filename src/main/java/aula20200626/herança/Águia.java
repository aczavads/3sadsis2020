package aula20200626.herança;

public class Águia extends Animal implements Vertebrado {

	@Override
	public void locomover() {
		System.out.println("Águia voando!");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Águia consumindo a caça!");
	}
	
	@Override
	public void morrer() {
		//super.morrer();
		System.out.println("Águia partindo para o além majestosamente.");
	}

	@Override
	public void formarOssos() {
		System.out.println("Águia formando esqueleto.");
	}

}
