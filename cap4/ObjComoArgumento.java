class ObjComoArgumento {
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

		boolean transfere(Conta destino, double valor) {
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
		c1.dono = "Duke";
		c1.saldo = 5000;

		Conta c2 = new Conta(); 
		c2.dono = "Donald";
		c2.saldo = 5000;

		c1.transfere(c2, 1000);

		System.out.println("Saldo c1 = " + c1.saldo);
		System.out.println("Saldo c2 = " + c2.saldo);

	}
}