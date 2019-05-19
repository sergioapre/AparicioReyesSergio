package calculadora;

// 2ª Refactorización, se añade una interfaz de la que cuelga todo el código.
public interface CalculadoraRPN {

	void extraerDeLaPila(double nuevo_dato);

	double colocarEnLaPila();

	double resultado();

}