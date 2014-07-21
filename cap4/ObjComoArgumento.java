class ObjComoArgumento {

	public static void main (String[] args) {
		Conta1 c1 = new Conta1();
		c1.dono = "Duke";
		c1.saldo = 5000;

		Conta1 c2 = new Conta1(); 
		c2.dono = "Donald";
		c2.saldo = 5000;

		c1.transferePara(c2, 1000);

		System.out.println("Saldo c1 = " + c1.saldo);
		System.out.println("Saldo c2 = " + c2.saldo);

	}
}