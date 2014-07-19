class TestaReferencias2 {
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
		Conta c1 = new Conta();
		c1.dono = "Duke";
		c1.saldo = 227;

		Conta c2 = new Conta(); 
		c2.dono = "Duke";
		c2.saldo = 227;

		if (c1 == c2){
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
		}

	}
}