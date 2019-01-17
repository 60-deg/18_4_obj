
public class MyNameJp implements MyName {
	@Override
	public void sayName(String name){
		System.out.println("私は" + name + "です.");
	}
	
	@Override
	public String getLanguage(){
		return "日本語";
	}
}
