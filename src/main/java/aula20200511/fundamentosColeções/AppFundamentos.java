package aula20200511.fundamentosColeções;

import java.util.ArrayList;
import java.util.Arrays;

public class AppFundamentos {
	
	public static void main(String[] args) {
		String[][] arrayMatriz5x5 = new String[5][5];
		
		ArrayList<String[]> matriz5x5 = new ArrayList<>();
		matriz5x5.add(new String[5]);
		matriz5x5.add(new String[5]);
		matriz5x5.add(new String[5]);
		matriz5x5.add(new String[5]);
		matriz5x5.add(new String[5]);
		
		matriz5x5.get(2)[2] = "Opa!";
		
		
		
		
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
