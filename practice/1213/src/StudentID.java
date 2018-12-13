
public class StudentID {
	protected String strId;
	
	// (A)
	public StudentID(String id){
		this.strId = id;
	}
	
	// (B)
	public StudentID(int enter, int number){
		this.strId = String.format("%02d_%05d", enter, number);
	}
	
	// (C)
	public String toString(){
		return strId;
	}
	
	
}
