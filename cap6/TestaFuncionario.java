class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Antonio");

		System.out.println("Nome inicial do Funcionario "+ f1.getNome());

		f1.setNome("José");
		f1.setDepartamento("Tecnologia");
		f1.setRG("111.111.111");
		System.out.println("Salário original " + f1.getSalario());
		f1.setSalario(1000);
	}
}