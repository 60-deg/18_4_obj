class MyObject {
	int data;

	void setData(int i) {
		data = i;
	}

	int getData() {
		return data;
	}

	public static void main(String[] argv) {
		MyObject a1, b1;
		a1 = new MyObject();
		b1 = new MyObject();
		a1.setData(2);
		b1.setData(3);
		System.out.println(a1.getData());
		System.out.println(b1.getData());

		MyObject[] a2 = new MyObject[5];
		a2[0] = new MyObject(); // この初期化をしないといけない
		a2[0].setData(2);
		System.out.println(a2[0].getData());

		int[] a3 = new int[5];
		a3[0] = 2;
		System.out.println(a3[0]);

		int[] a = new int[2];
		int[] b;
		a[0] = 0;
		a[1] = 10;
		b = a.clone();
		System.out.print(b[0] + ",");
		b[0] = 2;
		System.out.print(b[0] + ",");
		System.out.println(a[0]);

	}
}