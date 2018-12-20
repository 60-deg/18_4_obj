
public class MyBoolean {
	private boolean value;
	
	// (a)
	public MyBoolean(boolean val){
		setValue(val);
	}
	
	// (b)
	public boolean getValue(){
		return this.value;
	}
	public void setValue(boolean val){
		this.value = val;
	}
	
	// (c)
	public void setValue(int val){
		this.value = val!=0 ? true : false;
	}
	
	// (d)
	public MyBoolean(int val){
		setValue(val);
	}
	
}
