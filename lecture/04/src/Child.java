public class Child extends Parent {
	protected String name = "NONAME(child)";

	public Child() {
		System.out.println("Child() was called!");
		System.out.println("Who am I: " + this.getName());
	}

	public Child(String s) {
		this.name = s;
		System.out.println("Child(String) was called!");
		System.out.println("Who am I: " + this.getName());
	}

	public String getName() {
		return "I'm a Child named " + this.name; // nameと衝突する名前の変数がないので、this. は省略しても良い
	}
}