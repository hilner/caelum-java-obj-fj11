class Conta {

	int numero;
	Cliente titular = new Cliente();
	private double saldo;
	private double limite;

	void saca (double valor) {
		this.saldo = this.saldo - valor;
	}

	void deposita (double quantidade) {
		this.saldo += quantidade;
	}

	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
