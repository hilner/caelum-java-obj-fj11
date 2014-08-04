class Conta {

	int numero;
	private double saldo;
	private double limite;
	private Cliente titular = new Cliente();

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
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
