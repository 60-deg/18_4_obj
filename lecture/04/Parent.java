public class Parent {
	protected String name = "NONAME(parent)";

	public Parent() {
		System.out.println("Parent() was called!");
	}

	public Parent(String s) {
		System.out.println("Parent(String) was called!");
		this.name = s;
	}
}