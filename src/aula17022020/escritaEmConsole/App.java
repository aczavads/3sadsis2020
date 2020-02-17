package aula17022020.escritaEmConsole;

public class App {

	//+ main(args : String[]) : void
	//  ----------------------------
	public static void main(String[] args) {
		System.out.println("Hello World! :D");
		System.out.println( somar(20,30) );
		System.out.println( somar(-20,30) );
		System.out.println( dividir(20,30) );
		System.out.println( dividir(-20,30) );
		System.out.println( multiplicar(10,20,30) );
		System.out.println( multiplicar(10,-20,30) );
		System.out.println( multiplicar(20,30) );
		System.out.println( multiplicar(-20,30) );
	}	
	//- somar(v1 : double, v2 : double) : double
    //  ----------------------------------------
	private static double somar(double v1, double v2) {
		return v1+v2;
	}
	//- dividir(dividendo : double, divisor : double) : double
	//  ------------------------------------------------------
	private static double dividir(double dividendo, double divisor) {
		return dividendo/divisor;
	}
	//- multiplicar(v1 : int, v2 : int, v3 : int) : int
	//  -----------------------------------------------
	private static int multiplicar(int v1, int v2, int v3) {
		return v1*v2*v3;
	}
	
	private static int multiplicar(int v1, int v2) {
		int total = 0;
		for (int i = 0; i < v2; i++) {
			total = total + v1;
		}
		return total;
	}
}



