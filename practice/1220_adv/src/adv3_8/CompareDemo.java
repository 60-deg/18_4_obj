package adv3_8;

public class CompareDemo {
	public static void main(String[] args) {
		int[] a = new int[2];
		a[0] = 2017;
		a[1] = 2017;
 
		String[] b = new String[2];
		b[0] = new String("2017");
		b[1] = new String("2017");
 
		MyInt[] c = new MyInt[2];
		c[0] = new MyInt(2017);
		c[1] = new MyInt(2017);
 
		/* (a) 答案テンプレート */
		System.out.println(a[0] == a[1]);
		System.out.println(b[0] == b[1]);
		System.out.println(c[0] == c[1]);
 
		/* (b) 答案テンプレート
		 * b-1) True/False
		 * b-2) True/False
		 * b-3) True/False
		 * b-4) True/False
		 * b-5) True/False
		 */
	}
}
