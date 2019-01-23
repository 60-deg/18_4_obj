/*
 *
 * (A), (D)
 * (A), (B) ではaが参照する配列MyInt[2]に対してShallowCopyが行われるため、b[i]はa[i]に格納されているオブジェクトを参照する。(A)はそのオブジェクトに10を代入するため、a[0]もb[0]もvalとして10を持つ。(B)ではcloneの後にa[0]が別の新しいオブジェクトを参照するようになるため、b[0]が参照しているオブジェクトのvalに変化はない。
 * (C)では、配列aの各要素が持つvalのそれぞれに対してDeepCopyが行われる。b[i]はコピー時点でのa[i]のvalと同じ値をvalとして持ち、a[i]の参照するオブジェクトが変更されてもb[i]に影響はない。
 * (D)では、配列aの各要素が参照するオブジェクトMyIntに対してShallowCopyが行われるため、b[i]はa[i]に格納されているオブジェクトを参照する。よって、そのオブジェクトに対する変更はa[0]とb[0]の両方に影響する。
 * 
 */
public class CopyDemo {
	public static void main(String[] args) {
		MyInt[] a = new MyInt[2];
		MyInt[] b;
		a[0] = new MyInt(1);
		a[1] = new MyInt(2);

		b = new MyInt[2];
		for (int i = 0; i < 2; i++) {
			b[i] = a[i];
		}
		a[0].set(10);

		int c = a[0].get() + b[0].get();
		System.out.println(c);
	}
}