class Fibonacci {
	int calcFibonacci (int n) {
		if (n < 2){
			return n;
		} else {
			return calcFibonacci(n-1)+calcFibonacci(n-2);
		}
	}
}