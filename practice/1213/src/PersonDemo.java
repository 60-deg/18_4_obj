public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Name: " + p.getName());
		p.setName("Taro");
		System.out.println("Name: " + p.getName());
	}
}