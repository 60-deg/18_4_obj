public class MyBufferDemo {
	public static void main(String[] str) {
		MyBuffer buf = new MyBuffer(5);
		buf.append("This");
		buf.append(" ");
		buf.append("is");
		buf.append(" ");
		buf.append("MyBufferDemo");
		System.out.println(buf.toString());
		buf.flush();
		buf.append("A").append("B").append("C");
		System.out.println(buf.toString());
		buf.append("D").append("E").append("F");
		System.out.println(buf.toString());
	}
}
