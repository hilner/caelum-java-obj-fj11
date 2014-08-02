class TestaAcessoDireto {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		// não compila! não podemos acessar o atributo privado de outra classe
		minhaConta.saldo = 100;
	}
}