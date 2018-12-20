
public class Student {
	private FullName name;
	public int id;
	public Student(String last, String first, int id) {
		this.name = new FullName(last, first);
		this.id = id;
	}
	
	@Override
	public String toString(){
		return this.id + ":" + this.name.toString();
	}
}
