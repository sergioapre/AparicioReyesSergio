package calculadora;

// 2� Refactorizaci�n, se a�ade una interfaz de la que cuelga todo el c�digo.
public interface CalculadoraRPN {

	void extraerDeLaPila(double nuevo_dato);

	double colocarEnLaPila();

	double resultado();

}