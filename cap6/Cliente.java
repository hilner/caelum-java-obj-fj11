class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;

	Cliente(String cpf) {
		this.setCPF(cpf);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return this.cpf;
	}

	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}

	private void validaCPF(String cpf) {
		// implementação 
	}
}
