class Empresa {
	Funcionario[] empregados;
	String cnpj;
	int tam;

	// constructor
	public Empresa() {
		tam = 0;
		//empregados = new Funcionario[10];
	}

	void adiciona(Funcionario f) {
		if (tam < empregados.length) {
			empregados[tam] = f;
			empregados[tam].mostra();
			tam++;
		} else {
			System.out.println("\nVagas preenchidas!");
		}
	}

	void mostraEmpregados() {
		System.out.println();
		for (Funcionario i : empregados) { // enhanced-for
			System.out.println("Funcionário na posição: " + i);
			i.mostra();

		}
	}

	void mostraSalariosEmpregados() {
		double totalSalario = 0.0;
		System.out.println("\n\nSalários dos empregados");
		for (Funcionario i : empregados) {
			System.out.println("Nome do Funcionário: " + i.nome);
			System.out.println("Salário: " + i.salario);
			if (!contem(i)) {
				System.out.println("*** Funcionário não contratado ***");
			}
			totalSalario += i.salario;
		}
		System.out.println("\n|||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Total salários: " + totalSalario);
	}

	boolean contem(Funcionario f) {
		boolean contratado = false;
		for (Funcionario i : empregados) {
			if (i.nome == f.nome) {
				contratado = i.estaNaEmpresa;
			}
		}
		return contratado;
	}
}