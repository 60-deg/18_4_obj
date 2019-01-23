public class MyInt {
	private int val;
	public MyInt(int val) {
		this.val = val;
	}
	public void set(int val) {
		this.val = val;
	}
	public int get() {
		return val;
	}
	@Override
	public String toString() {
		return Integer.toString(val);
	}

}