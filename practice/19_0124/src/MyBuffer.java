import java.util.ArrayList;
import java.util.List;

public class MyBuffer implements MyAppendable, MyFlushable {
	private int size;
	private List<String> str;

	public MyBuffer(int n) {
		this.size = n;
		this.str = new ArrayList<String>();
	}

	public MyBuffer(int n, List<String> str) {
		this.size = n;
		this.str = str;
	}

	public void flush() {
		this.str.clear();
	}

	public String toString() {
		String ret = "";
		for (String x : this.str) {
			ret = ret + x;
		}
		return ret;
	}

	public MyAppendable append(String newStr) {
		if (this.size > this.str.size()) {
			this.str.add(newStr);
		} else {
			System.out.println("容量が足りないため" + newStr + "を追加できません．");
		}
		return new MyBuffer(this.size, this.str);
	}
}