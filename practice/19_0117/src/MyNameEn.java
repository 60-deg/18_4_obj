
public class MyNameEn implements MyName {
	@Override
	public void sayName(String name){
		System.out.println("I am " + name + ".");
	}
	
	@Override
	public String getLanguage(){
		return "English";
	}
}
