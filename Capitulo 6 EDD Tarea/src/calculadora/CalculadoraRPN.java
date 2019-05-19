package calculadora;

public interface CalculadoraRPN {

	void pushPila(double nuevo_dato);

	double colocarEnLaPila();

	double resultado();

}