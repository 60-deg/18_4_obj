import java.util.ArrayList;

public class MyStack<T> {
	ArrayList<T> stack;

	public MyStack() {
		this.stack = new ArrayList<T>();
	}

	public MyStack(T o) {
		this.stack = new ArrayList<T>();
		stack.add(o);
	}

	public void push(T o) {
		stack.add(o);
	}

	public T pop() {
		if (stack.isEmpty()) {
			return null;
		}
		T ret = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return ret;
	}

}
