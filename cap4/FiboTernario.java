class FiboTernario {
	int calcFibo (int n) {
		int valor = (n < 2) ? n : calcFibo(n-1)+calcFibo(n-2);
		return valor;
	}
}