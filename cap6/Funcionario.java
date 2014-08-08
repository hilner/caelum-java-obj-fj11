class Funcionario {
	String nome;
	String departamento;
	private double salario;
	String rg;
	boolean estaNaEmpresa;

	public double getSalario() {
		return this.salario;	
	}

	public void setSalario(double Salario) {
		this.salario = salario;
		System.out.println("Definido salário de: " + salario);
	}

	void recebeAumento(double aumento) {
		salario += aumento;
	}

	public double getGanhoAnual () {
		return this.salario * 12;
	}

	void mostra() {
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salario: " + salario);
		System.out.println("RG: " + rg);
		System.out.println("Ganho Anual: " + getGanhoAnual());
	}
}