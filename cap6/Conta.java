class Conta {

	int numero;
	Cliente titular = new Cliente();
	private double saldo;
	private double limite;

	public void saca (double valor) {
		// posso sacar até saldo+limite
		if (valor > this.saldo + this.limite) {
			System.out.println("Não posso sacar fora do limite!");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	void deposita (double quantidade) {
		this.saldo += quantidade;
	}

	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
