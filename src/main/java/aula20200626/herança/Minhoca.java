package aula20200626.herança;

public class Minhoca extends Animal implements Invertebrado {

	@Override
	public void locomover() {
		System.out.println("Minhoca se arrastando...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Minhoca deglutindo matéria orgânica.");
		
	}

}
