public class MyStackDemo {
	public static void main(String[] args) {
		MyStack<String> mss = new MyStack<>();
		mss.push("a");
		mss.push("b");
		mss.push("c");
		System.out.println(mss.pop());
		System.out.println(mss.pop());
		System.out.println(mss.pop());
		MyStack<Integer> msi = new MyStack<>(1);
		msi.push(2);
		System.out.println(msi.pop());
		System.out.println(msi.pop());
		System.out.println(msi.pop());
	}
}