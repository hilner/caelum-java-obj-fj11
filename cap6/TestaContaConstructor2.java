class TestaContaConstructor2 {
	public static void main(String[] args) {
		ClienteTeste1 carlos = new ClienteTeste1();
		carlos.setNome("Carlos");

		ContaTeste1 c = new ContaTeste1(1, carlos);
		System.out.println(c.getTitular().getNome() + "\nnúmero: " + c.numero);


	}
}