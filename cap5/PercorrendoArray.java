class PercorrendoArray {
	void imprimeArray(int[] array) {
		// todo array tem um atributo length - tamanho do array
		for (int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		int[] idades = new int[10];
		for (int i = 0; i < 10; ++i) {
			idades[i] = i * 10;
		}
		for (int i = 0; i < 10; ++i) {
			System.out.println(idades[i]);
		}
	}
	
}