class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionriosGerenciados;

	public void setSenha(int senha) {
		System.out.println("Gerando senha!");
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

}

