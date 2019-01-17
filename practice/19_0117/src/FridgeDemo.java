
public class FridgeDemo {
	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		fridge.add(new Food("apple"));
		fridge.add(new Food("orange"));
		fridge.add(new Food("banana"));
 
		MyIterator it = fridge.iterator();
		while (it.hasNext()) {
			Food food = (Food) it.next();
			System.out.println(food);
		}
	}
}