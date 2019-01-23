import java.util.ArrayList;
import java.util.List;

public class Fridge implements Aggregate {
	private List<Food> foods = new ArrayList<Food>();

	@Override
	public FridgeIterator iterator() {
		return new FridgeIterator(foods.iterator());
	}

	public void add(Food food) {
		foods.add(food);
	}

}
