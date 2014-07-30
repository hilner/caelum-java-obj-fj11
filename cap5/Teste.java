class Teste {

	static void arrayZeroElemento() {
		/* compila, instancia, mas não acessa */
		int[] zero;		
		zero = new int[0];
		// ArrayIndexOutOfBoundsException
		//System.out.println(zero[0]); 
	}

	static void arrayNegativoElemento() {
		/* compila, mas não instancia */
		int[] negativo;
		//NegativeArraySizeException
		negativo = new int[-1];
	}

	public static void main(String[] args) {
		for (String argumento : args) {
			System.out.println(argumento);
		}
		// testa arrays
		arrayZeroElemento();
		arrayNegativoElemento();
	}
}