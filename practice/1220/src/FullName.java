
public class FullName {
	private String lastName, firstName;
	
	public FullName(String last, String first){
		this.lastName = last;
		this.firstName = first;
	}
	
	public String toString(){
		return this.lastName + " " + this.firstName;
	}
}
