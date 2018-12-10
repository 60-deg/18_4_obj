
public class ErrorDemo {
	public static void main(String[] args) {
		final String[] po = { "0" };
		try {
			System.out.println(po[1]);
		} catch (Exception e) {
			System.out.println("error: " + e.toString());
		} finally {
		}

	}
}
