public class PrimeNumberFinderDemo {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Simple Algorithm");
		PrimeNumberFinder simpleFinder = new PrimeNumberFinder(new SimpleAlgorithm());
		System.out.println(simpleFinder.maxPrimeNumber(n));

		System.out.println("Fast Algorithm");
		PrimeNumberFinder fastFinder = new PrimeNumberFinder(new FastAlgorithm());
		System.out.println(fastFinder.maxPrimeNumber(n));

		System.out.println("Defalt is Fast Algorithm");
		PrimeNumberFinder defaltFinder = new PrimeNumberFinder();
		System.out.println(defaltFinder.maxPrimeNumber(n));
	}
}