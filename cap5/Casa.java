class Casa {
	String cor;
	int totalDePortas;
	int qtd;
	Porta[] portas;

	Casa() {
		qtd = 0;
		cor = "sem cor";
		totalDePortas = 0;
	}

	void pinta(String s) {
		cor = s;
	}

	int quantasPortasEstaoAbertas() {
		int totalAbertas = 0;
		for (Porta p : portas ) {
			if (p.estaAberta) {
				totalAbertas++;
			}
		}
		return totalAbertas;
	}

	void adicionaPorta(Porta p) {
		if (qtd < portas.length) {
			portas[qtd] = p;
			qtd++;
		} else {
			System.out.println("\nPortas adicionadas!");
		}

	}

	int totalDePortas() {
		int totalPortas = 0;
		for (Porta p : portas ) {
			totalPortas++;
		}
		return totalPortas;
	}
}