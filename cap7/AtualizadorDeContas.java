class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(0.1);
		System.out.println("Saldo atual: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}

	public double getSelic() {
		return this.selic;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}