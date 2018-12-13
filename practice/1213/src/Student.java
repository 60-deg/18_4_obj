
public class Student extends Person {
	// (A)
	protected int id = 0;
	
	// (B)
	public int getID(){
		return this.id;
	}
	
	// (C)
	public void setID(int x){
		this.id = x;
	}
}
