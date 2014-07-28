class Conta {

	int numero;
	Cliente titular = new Cliente();
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

	boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou) {
			// sem sacar
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
}
