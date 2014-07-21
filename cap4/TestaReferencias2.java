class TestaReferencias2 {

	public static void main (String[] args) {
		Conta1 c1 = new Conta1();
		c1.dono = "Duke";
		c1.saldo = 227;

		Conta1 c2 = new Conta1(); 
		c2.dono = "Duke";
		c2.saldo = 227;

		if (c1 == c2){
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes!");
		}

	}
}