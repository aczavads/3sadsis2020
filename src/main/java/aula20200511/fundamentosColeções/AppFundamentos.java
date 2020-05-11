package aula20200511.fundamentosColeções;

import java.util.ArrayList;

public class AppFundamentos {
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes1 = new ArrayList<>();
		nomes1.add("Ana");
		nomes1.add("Beatriz");
		nomes1.add("Luíza");
		
		ArrayList<String> nomes2 = new ArrayList<>();
		nomes2.add("Ana");
		nomes2.add("Beatriz");
		nomes2.add("Luíza");
		
		
		System.out.println(nomes1 == nomes2);
		System.out.println(nomes1.equals(nomes2));
		
	}

}
