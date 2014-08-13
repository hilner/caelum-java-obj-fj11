final class FabricaDeCarro {
	private static FabricaDeCarro instance = null;

	private FabricaDeCarro(){}

	public static FabricaDeCarro getInstancia() {
		if (instance == null) {
			instance = new FabricaDeCarro();
		}
		return instance;
	}

}