
public class X {
	public String n = "x";

	public String getN() {
		return n;
	}

	public static void main(String[] args) {
		X x = new X();
		System.out.println("getN = " + x.getN() + ", x.n = " + x.n);

		x = new SubX();
		System.out.println("getN = " + x.getN() + ", x.n = " + x.n);

		SubX sx = new SubX();
		System.out.println("getN = " + sx.getN() + ", sx.n = " + sx.n);

	}

}

class SubX extends X {
	public String n = "SubX";

	public String getN() {
		return n;
	}
}
