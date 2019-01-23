public class PrimalityTestDemo {
	public static void main(String[] args) {
		PrimalityTest simple = new SimpleAlgorithm();
		PrimalityTest fast = new FastAlgorithm();
		System.out.println("SimpleAlgorithm");
		System.out.println(simple.isPrime(11));
		System.out.println("FastAlgorithm");
		System.out.println(fast.isPrime(11));
	}
}