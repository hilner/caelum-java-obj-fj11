class ControleDeBonificacao {
	private double totalDeBonificacao = 0;

	public void registra(Funcionario funcionario) {
		this.totalDeBonificacao += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacao;
	}
}