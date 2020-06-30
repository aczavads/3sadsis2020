package aula20200629.dúvidasFinais;

import java.util.ArrayList;
import java.util.Date;

public class AppDúvidasFinais {
	
	public static void main(String[] args) {
		Morcego m01 = new Morcego();
		Helicóptero h01 = new Helicóptero();
		Pipa p01 = new Pipa();
		
		
		m01.decolar();
		h01.decolar();
		p01.decolar();
		
		ArrayList<CoisaQueDecola> ambiente = new ArrayList<>();
		ambiente.add(m01);
		ambiente.add(h01);
		ambiente.add(p01);
		for (CoisaQueDecola obj : ambiente) {
			obj.decolar();
		}
		
		testarSeObjetosSãoIguais(new Date(), m01); 		
	}

	private static void testarSeObjetosSãoIguais(Object obj1, Object obj2) {
		System.out.println(obj1.toString() + "   " + obj2.toString());
		System.out.println(obj1.equals(obj2));
	}
	

}
