package calculadora;

import java.util.Scanner;

public class TestRPN {
	/* metodo main */
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		while(true) {
			// 1� Refactorizaci�n, se a�ade la siguiente l�nea porque "in"
			// nunca se cierra.
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce expresion Postfija o teclea \"fin\".");
			String linea = in.nextLine( );
				if(linea.equals("fin")) {
					System.out.println("Fin de programa");
					break;
			}
			else {
				CalculadoraRPN calc = new CalculoRPN(linea);
				System.out.printf("El resultado es %f\n", calc.resultado());
			}
		}
	}
}