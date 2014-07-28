class ArrayPorReferencia {
	public static void main(String[] args) {
		Conta[] minhasContas;
		minhasContas = new Conta[10];

		// erro de execução - sem referencia para conta
		for (int n = 0; n < 10; ++n) {
			System.out.println("Conta " + n + " saldo " + minhasContas[n].saldo);
		}
	}
}