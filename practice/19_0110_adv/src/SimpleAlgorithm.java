
public class SimpleAlgorithm implements PrimalityTest {

	@Override
	public boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (MyModulo.mod(n, i) == 0) {
				return false;
			}
		}
		return true;
	}

}
