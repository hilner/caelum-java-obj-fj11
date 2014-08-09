class Empresa {
	Funcionario[] empregados;
	private String cnpj;
	int tam;

	// constructor
	public Empresa() {
		tam = 0;
	}

	public Empresa(int quantidade) {
		this.empregados = new Funcionario[quantidade];

	}
	// Funcionário
	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}

	public void setFuncionario(Funcionario f) {
		adiciona(f);
	}

	// CNPJ
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	// encapsulado
	private void adiciona(Funcionario f) {
		if (tam < empregados.length) {
			empregados[tam] = f;
			//empregados[tam].mostra();
			tam++;
		} else {
			System.out.println("\nVagas preenchidas!");
		}
	}

	void mostraEmpregados() {
		System.out.println();
		for (Funcionario i : empregados) { // enhanced-for
			i.mostra();
		}
	}

	void mostraSalariosEmpregados() {
		double totalSalario = 0.0;
		System.out.println("\n\nSalários dos empregados");
		for (Funcionario i : empregados) {
			System.out.println("Nome do Funcionário: " + i.getNome());
			System.out.println("Salário: " + i.getSalario());
			if (!contem(i)) {
				System.out.println("*** Funcionário não contratado ***");
			}
			totalSalario += i.getSalario();
		}
		System.out.println("\n|||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Total salários: " + totalSalario);
	}

	boolean contem(Funcionario f) {
		boolean contratado = false;
		for (Funcionario i : empregados) {
			if (i.getNome() == f.getNome()) {
				contratado = i.getEstaNaEmpresa();
			}
		}
		return contratado;
	}
}