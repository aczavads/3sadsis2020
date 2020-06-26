package aula20200626.herança;

import java.util.ArrayList;
import java.util.List;

public class AppHerança26 {

	public static void main(String[] args) {
		List<Animal> zoológico = new ArrayList<>();
		
		zoológico.add(new Águia());
		zoológico.add(new Tigre());
		zoológico.add(new Minhoca());
		zoológico.add(new Minhoca());
		zoológico.add(new Tilápia());
		zoológico.add(new Tilápia());
		zoológico.add(new Tilápia());
		zoológico.add(new Tilápia());
		zoológico.add(new Tigre());
		zoológico.add(new Tigre());
		
		for (Animal a : zoológico) {
			if (a instanceof Vertebrado) {
				Vertebrado novaReferência = (Vertebrado) a;
				novaReferência.formarOssos();
			} else if (a instanceof Invertebrado) {
				System.out.println("Opa, um invertebrado aqui! " + a.getClass() );
			}
			//a.alimentar();
			//a.morrer();
		}
		
		System.out.println("Fim.");
		
		
	}
	
}
