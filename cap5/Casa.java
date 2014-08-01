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
			System.out.println("\n" + qtd + " porta adicionada...");
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

	void abrirPorta(Porta p) {
		int n = p.porta;
		portas[n-1].estaAberta = true;
	}

	void fecharPorta(Porta p) {
		int n = p.porta;
		portas[n-1].estaAberta = false;
	}

}