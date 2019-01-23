public class GrandChild extends Child {
//	protected String name = "NONAME(grandchild)";	// override (GrandChild.name を定義)

	public GrandChild() {
		System.out.println("GrandChild() was called");
		System.out.println("Who am I: " + this.getName());
	}

	public GrandChild(String s) {
		this.name = s;
		System.out.println("GrandChild(String) was called");
		System.out.println("Who am I: " + this.getName());
	}

	@Override
	public String getName() {
		return "I'm a GrandChild named " + this.name;
	}
}