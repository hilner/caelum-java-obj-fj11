class TestaReferencias {
	public static class Conta {
		int numero;
		String dono;
		double saldo;
		double limite;

		boolean saca (double valor) {
			if (this.saldo < valor) {
				return false;
			}
			else {
				this.saldo = this.saldo - valor;
				return true;
			}
		}

		void deposita (double quantidade) {
			this.saldo += quantidade;
		}
	}

	public static void main (String[] args) {
		Conta c1 = new Conta();
		c1.deposita(100);

		Conta c2 = c1; // linha importante!
		c2.deposita(200);

		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
	}
}