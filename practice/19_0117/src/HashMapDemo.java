import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]){
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("carrot", "deep orange edible root of the cultivated carrot plant");
		mp.put("lettuce", "leaves of any of various plants of Lactuca sativa");
		mp.put("tomato", "mildly acid red or yellow pulpy fruit eaten as a vegetable");
		
		if (args.length<1){
			return;
		}
		final String key = args[0];
		System.out.println(mp.containsKey(key) ? mp.get(key) : "not found");
	}
}
