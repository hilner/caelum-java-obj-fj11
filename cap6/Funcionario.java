class Funcionario {
	
	private static int ID;

	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private boolean estaNaEmpresa;

	public Funcionario() {
		Funcionario.ID++;
		nome = "sem nome";
		salario = 0.0;
	}

	public static int getID() {
		return Funcionario.ID;
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}

	// rg
	public void setRG(String rg) {
		this.rg = rg;
		System.out.println("Identidade: " + rg);
	}

	public String getRG() {
		return rg;
	}

	// nome
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome do Funcionario é " + nome);
	}

	public String getNome() {
		return nome;
	}

	// departamento
	public void setDepartamento(String departamento) {
		this.departamento = departamento;			
		System.out.println("Departamento " + departamento);
	}

	// estaNaEmpresa ?
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
		System.out.println("Esta na empresa: " + estaNaEmpresa);
	}

	public boolean getEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	// salario 
	public double getSalario() {
		return this.salario;	
	}

	public void setSalario(double salario) {
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