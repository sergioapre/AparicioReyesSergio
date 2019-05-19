package calculadora;

public class CalculoRPN implements CalculadoraRPN {
	
	/* (sin Javadoc)
	 * @see calculadora.CalculadoraRPN#pushPila(double)
	 */
	@Override
	// 3ª refactorización, se cambia el nombre del método popPila
	//por otro mas entendible: "extraerDeLaPila"
	public void extraerDeLaPila(double nuevo_dato) {
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, arriba);
			arriba = nuevo_nodo;
	}
	
	/* (sin Javadoc)
	 * @see calculadora.CalculadoraRPN#colocarEnLaPila()
	 */
	@Override
	//3ª refactorización, se cambia el nombre del método popPila
	//por otro mas entendible: "colocarEnLaPila"
	public double colocarEnLaPila() {
		double dato_arriba = arriba.dato;
		arriba = arriba.abajo;
		return dato_arriba;
	}
	
	public CalculoRPN(String commando) {
		arriba = null;
		this.commando = commando;
	}
	
	/* (sin Javadoc)
	 * @see calculadora.CalculadoraRPN#resultado()
	 */
	@Override
	public double resultado( ) {
		double a, b;
		int j;
		for(int i = 0; i < commando.length( ); i++) {
			// si es un digito
			if(Character.isDigit(commando.charAt(i))) {
				double numero;
				// obtener un string a partir del numero
				String temp = "";
				for(j = 0; (j < 100) && (Character.isDigit(
						commando.charAt(i)) || (commando.charAt(i) == '.')); j++, i++) {
					temp = temp + String.valueOf(commando.
							charAt(i));
				}
				//convertir a double y añadir a la pila
				numero = Double.parseDouble(temp);
				extraerDeLaPila(numero);
			} 
			else if(commando.charAt(i) == '+') {
				b = colocarEnLaPila( );
				a = colocarEnLaPila( );
				extraerDeLaPila(a + b);
			}
			else if(commando.charAt(i) == '-') {
				b = colocarEnLaPila( );
				a = colocarEnLaPila( );
				extraerDeLaPila(a - b);
			}
			else if(commando.charAt(i) == '*') {
				b = colocarEnLaPila( );
				a = colocarEnLaPila( );
				extraerDeLaPila(a * b);
			}
			else if(commando.charAt(i) == '/') {
				b = colocarEnLaPila( );
				a = colocarEnLaPila( );
				extraerDeLaPila(a / b);
			}
			else if(commando.charAt(i) == '^') {
				b = colocarEnLaPila( );
				a = colocarEnLaPila( );
				extraerDeLaPila(Math.pow(a, b));
			}
			else if(commando.charAt(i) == '%') {
				b = colocarEnLaPila( );
				a = colocarEnLaPila( );
				extraerDeLaPila(a % b);
			}
			else if(commando.charAt(i) != ' ') {
				throw new IllegalArgumentException( );
			}
		}
		
		double val = colocarEnLaPila( );
		
		if(arriba != null) {
			throw new IllegalArgumentException( );
		}
		
		return val;
		
	}

	private String commando;
	private NodoPila arriba;
}