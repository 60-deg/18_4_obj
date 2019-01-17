import java.util.*;
import java.util.Collections;
import java.util.Iterator;

public class SortDemo {
	public static void main(String args[]){
		// (a)
		String fruits[] = {"apple", "grape", "orange", "banana", "melon"};
		List<String> fruitsList = new ArrayList<String>();
		for(int i=0; i<fruits.length; i++){
			fruitsList.add(fruits[i]);
		}
		
		// (b)
		Collections.sort(fruitsList);
		
		// (c)
		for(String fruit : fruitsList){
			System.out.println(fruit);
		}
		
		// (d)
		Iterator<String> itr = fruitsList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}	
}
