
public class StudentID {
	protected String strId;
	protected int enter = 0, number = 0;
	
	// (A)
	public StudentID(String id){
		this.strId = id;
	}
	
	// (B)
	public StudentID(int enter, int number){
		this.enter = enter;
		this.number = number;
		this.strId = toString();
	}
	
	// (C)
	public String toString(){
		return String.format("%02d_%05d", enter, number);
	}
	
	
}
