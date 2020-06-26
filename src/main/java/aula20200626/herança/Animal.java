package aula20200626.herança;

public abstract class Animal {
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
	public void morrer() {		
		System.out.println("Parada completa dos processos biológicos... #rip");
	}

}
