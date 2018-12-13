public class StudentIDDemo {
	public static void main(String[] args) {
		StudentID sid1 = new StudentID("17_00000");
		System.out.println(sid1);
		StudentID sid2 = new StudentID(17,3);
		System.out.println(sid2);
	}
}