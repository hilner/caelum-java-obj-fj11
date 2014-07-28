class Basico {
	public static void main(String[] args) {
		int idade1 = 20;
		int idade2 = 21;
		int idade3 = 22;
		int idade4 = 23;

		// com arrays

		int[] idades; // tipo int[]

		idades = new int[10];
		idades[5] = 10;

		for (int n = 0; n < 10 ; ++n) {
			System.out.println("Idade contida no elemento " + n + " é " + idades[n] + " anos!");
		}		
	}
}