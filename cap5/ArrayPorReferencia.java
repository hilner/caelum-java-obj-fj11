class ArrayPorReferencia {
	public static void main(String[] args) {
		Conta[] minhasContas;
		minhasContas = new Conta[10];

		Conta contaNova = new Conta();
		contaNova.saldo = 1000.0;
		minhasContas[0] = contaNova;

		// ou podemos fazer diretamente

		minhasContas[1] = new Conta();
		minhasContas[1].saldo = 3200.0;

		for (int n = 0; n < 2; ++n) {
			System.out.println("Conta " + n + " saldo = " + minhasContas[n].saldo);
		}
	}
}