class Conta {
	private static int totalDeContas;

	int numero;
	private double saldo;
	private double limite;
	private Cliente titular;// = new Cliente();

	Conta(Cliente titular) {
		this.titular = titular;
		Conta.totalDeContas++;
		System.out.println("\nTotal de Contas: " + Conta.totalDeContas);
	}

	public int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
			this.saldo -= valor;
		}
	}

	public void deposita (double quantidade) {
		if (quantidade < 0) {
			System.out.println("Valor negativo não permitido!");
		} else {
			this.saldo += quantidade;
		}
	}

	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
