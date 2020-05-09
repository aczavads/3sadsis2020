package aula20200508.arrayList;

import java.util.ArrayList;
import java.util.Date;

import aula20200508.associaçõesComArray.Pessoa;


public class AppArrayList {
	
	public static void main(String[] args) {
		ArrayList coisas = new ArrayList();
		coisas.add("Olha");
		coisas.add("Tipo");
		coisas.add("100");
		coisas.add(100);
		coisas.add(555.55);
		coisas.add(new Date());
		coisas.add(new Pessoa("Beltrano",33));
		
		coisas.remove("Olha");
		coisas.remove("Tipo");
		
		for (Object coisa : coisas) {
			System.out.println(coisa);
		}
		
	}

}
