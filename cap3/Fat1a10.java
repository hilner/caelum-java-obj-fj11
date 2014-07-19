class Fat1a10 {
	public static void main (String[] args) {
		int fatorial = 1;
		for (int n = 1; n <= 10; ++n) {
			System.out.println(n + "! = " + fatorial(n));
		}
	}

	public static long fatorial(long num) {
		if (num <=1) {
		       	return 1;
		}
		else {
			return num *  fatorial(num - 1);
		}
	}
}
