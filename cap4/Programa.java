class Programa {

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
		// criando a conta
		Conta minhaConta;
		minhaConta = new Conta();

		// alterando os valores de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;

		System.out.println("Saldo inicial: " + minhaConta.saldo);

		// saca 200 reais
		if (minhaConta.saca(200)) {
			System.out.println("Retirada: " + 200 + " reais");
			System.out.println("Saldo atualizado: " + minhaConta.saldo);
		} else {
			System.out.println("Não consegui sacar");
		}

		// deposita 500 reais
		minhaConta.deposita(500);

		System.out.println("Deposito: " + 500 + " reais");
		System.out.println("Saldo atualizado: " + minhaConta.saldo);

	}
}
