class TestaEmpregadoFaculdade {
	public static void main(String[] args) {
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
		empregado.setNome("Roberto");
		empregado.setSalario(5000.0);
		System.out.println(empregado.getInfo());

		ProfessorDaFaculdade professor = new ProfessorDaFaculdade();
		professor.setNome("Jadilson");
		professor.setSalario(10000.0);
		professor.setHorasDeAula(100);
		System.out.println(professor.getInfo());

		Reitor reitor = new Reitor();
		reitor.setNome("Wellington");
		reitor.setSalario(10000.0);
		System.out.println(reitor.getInfo());

		GeradorDeRelatorio relatorio = new GeradorDeRelatorio();
		relatorio.adiciona(empregado);
		relatorio.adiciona(professor);
		relatorio.adiciona(reitor);
	}
}