class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	boolean estaNaEmpresa;

	void recebeAumento(double aumento) {
		salario += aumento;
	};

	double calculaGanhoAnual () {
		return this.salario * 12;
	};

	void mostra() {
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salario: " + salario);
		System.out.println("Data da Entrada: " + dataEntrada.formatada("-"));
		System.out.println("RG: " + rg);
		System.out.println("Ganho Anual: " + calculaGanhoAnual());
	}
}

