class Programa {

	public static class Conta {
		int numero;
		String dono;
		double saldo;
		double limite;

		void saca (double quantidade) {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
		}
	}

	public static void main (String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();

		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;

		System.out.println("Saldo atual: " + minhaConta.saldo);

	}
}
