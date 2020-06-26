package aula20200626.herança;

public class Tilápia extends Animal implements Vertebrado {

	@Override
	public void locomover() {
		System.out.println("Tilápia nadando!");
	}

	@Override
	public void alimentar() {
		System.out.println("Tilápia comendo plânctom");
		
	}

	@Override
	public void formarOssos() {
		System.out.println("Tilápia calcificando estruturas não cartilaginosas.");
	}

}
