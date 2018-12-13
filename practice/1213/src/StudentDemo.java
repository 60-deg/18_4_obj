public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setID(3);
		s.setName("Taro");
		System.out.println("ID: " + s.getID());
		System.out.println("Name: " + s.getName());
	}
}