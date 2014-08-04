class ContaTeste1 {

	int numero;
	private double saldo;
	private double limite;
	private ClienteTeste1 titular;// = new Cliente();

	ContaTeste1(ClienteTeste1 titular) {
		System.out.println("Construindo ContaTeste1");
		this.titular = titular;
	}

	ContaTeste1(int numero, ClienteTeste1 titular) {
		this(titular); // chama o constructor que foi declarado acima
		this.numero = numero;		
		System.out.println("Construindo ContaTeste1 com outro argumento");
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

	public ClienteTeste1 getTitular() {
		return this.titular;
	}

	public void setTitular(ClienteTeste1 titular) {
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

	void transferePara(ContaTeste1 destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
