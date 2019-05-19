package calculadora;

/*
Objetivo: Obtener c�digo refactorizado a partir de otro que no lo est�.
Tarea: Para esta tarea, se refactorizar� un programa mal escrito, sin cambiar la forma en que funciona el programa. Este programa, RPN.java es una calculadora de notaci�n inversa polaca que utiliza una pila.
Reverse Polish notation (RPN) Notaci�n Polaca inversa, por ejemplo
la expresi�n: 4 * 5 - 7 / 2 % 3 nos da 1,5 respetando la prioridad de
los operadores en notaci�n RPN seria: 4 5 * 7 2 / - 3 % (pues no podemos poner los par�ntesis para alterar la prioridad)
Se debe reorganizar este c�digo usando al menos tres de las reglas
vistas en clase.
*/

public class NodoPila {
	
	public NodoPila(double dato, NodoPila abajo) {
		this.dato = dato;
		this.abajo = abajo;
	}
	
	public NodoPila abajo;
	public double dato;
}