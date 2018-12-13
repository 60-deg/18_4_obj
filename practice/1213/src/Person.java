
public class Person {
	// (A)
	protected String name = "name";
	
	// (B)
	public String getName(){
		return this.name;
	}
	
	// (C)
	public void setName(String s){
		this.name = s;
	}
}
