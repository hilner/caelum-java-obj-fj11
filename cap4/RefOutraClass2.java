class RefOutraClass2 {

	public static class Cliente {
		String nome;
		String sobrenome;
		String cpf;
	}

	public static class Conta {
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

	public static void main (String[] args) {
		Conta c1 = new Conta();
		//Cliente cliente = new Cliente();
		//c1.titular = cliente;

		c1.titular.nome = "Duke";
		c1.titular.sobrenome = "Donald";
		c1.saldo = 5000;


		System.out.println("Titular ");
		System.out.println("Nome = " + c1.titular.nome);
		System.out.println("Sobrenome = " + c1.titular.sobrenome);

	}
}