class TestaFibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		for (int i = 1; i <= 6; ++i ) {
			int resultado = fib.calcFibonacci(i);
			System.out.println(resultado);
		}

		// Fibonacci em com ternário
		FiboTernario fibT = new FiboTernario();
		
		for (int i = 1; i <= 6; ++i ) {
			int resultado = fibT.calcFibo(i);
			System.out.println(resultado);
		}

	}
}