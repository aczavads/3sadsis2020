package aula20200626.herança;

public class Tigre extends Animal implements Vertebrado {

	@Override
	public void locomover() {
		System.out.println("Tigre correndo!");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Tigre consumindo a caça!");		
	}

	@Override
	public void formarOssos() {
		System.out.println("Tigre formando ossos.");
		
	}

}
