class TestaIdentClassFunc {
	public static void main(String[] args) {
		System.out.println("Ultimo ID: " + Funcionario.getID());
		Funcionario f1 = new Funcionario();
		System.out.println("\nID: " + f1.getID());
		f1.setNome("José");
		f1.setSalario(10000.0f);
	}
}