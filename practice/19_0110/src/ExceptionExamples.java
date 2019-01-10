
public class ExceptionExamples {
	private String[] places = { "Tokyo", "Kyoto", "Osaka" };
	private String buf = null;
	private int a = 10;

	public int m1() {
		for (int i = 0; i < 10; i++) {
			a -= i;
			a /= a;
		}
		return a;
	}

	public int m2() {
		return buf.length();
	}

	public int m3() {
		return Integer.parseInt(places[0]);
	}

	public String m4(int index) {
		return places[index];
	}

	public int m5(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("For input: " + a);
		}
		return a;
	}

	public static void main(String[] args) {
		ExceptionExamples ex = new ExceptionExamples();
		// 以下に答案を記入すること．
		try {
			ex.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ex.m2();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ex.m3();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ex.m4(4);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ex.m5(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}