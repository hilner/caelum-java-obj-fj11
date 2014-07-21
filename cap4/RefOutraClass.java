class RefOutraClass {

	public static void main (String[] args) {
		Conta c1 = new Conta();
		Cliente cliente = new Cliente();
		c1.titular = cliente;

		c1.titular.nome = "Duke";
		c1.titular.sobrenome = "Donald";
		c1.saldo = 5000;


		System.out.println("Titular ");
		System.out.println("Nome = " + c1.titular.nome);
		System.out.println("Sobrenome = " + c1.titular.sobrenome);

	}
}