
public class PrimeNumberFinder {
	PrimalityTest algorithm;

	public PrimeNumberFinder(PrimalityTest algorithm) {
		this.algorithm = algorithm;
	}

	public PrimeNumberFinder() {
		this.algorithm = new FastAlgorithm();
	}

	public int maxPrimeNumber(int n) {
		for (int i = n; i >= 2; i--) {
			if (this.algorithm.isPrime(i)) {
				return i;
			}
		}
		return -1;
	}
}
