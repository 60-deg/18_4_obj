
public class FastAlgorithm implements PrimalityTest {

	@Override
	public boolean isPrime(int n) {
		if (n < 0) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (MyModulo.mod(n, 2) == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (MyModulo.mod(n, i) == 0) {
				return false;
			}
		}
		return true;
	}

}
