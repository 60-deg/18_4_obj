import java.util.List;
import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args){
		// (a)
		List<String> lst = new ArrayList<String>(5);
		String[] elements = {"one", "two", "three", "four", "five"};
		for(int i=0; i<elements.length; i++){
			lst.add(elements[i]);
		}
		
		// (b)
		for(String l : lst){
			System.out.println(l.toUpperCase());
		}
	}
}

