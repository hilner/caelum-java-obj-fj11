class TestaEmpregadoFaculdade {
	public static void main(String[] args) {
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
		empregado.setNome("Roberto");
		empregado.setSalario(5000.0);

		System.out.println(empregado.getInfo());
	}
}