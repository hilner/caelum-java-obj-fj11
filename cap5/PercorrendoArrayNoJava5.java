class PercorrendoArrayNoJava5 {
	
	void imprimeArray(int[] array) {
		// com enhanced-for
		for (int x : array) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int[] idades = new int[10];
		for (int i = 0; i < 10; ++i) {
			idades[i] = i * 10;
		}
		for (int x : idades) {
			System.out.println(x);
		}
	}
	
}