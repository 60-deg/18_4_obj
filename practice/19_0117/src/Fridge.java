import java.util.*;

public class Fridge implements Aggregate {
	private List<Food> foods = new ArrayList<Food>();

	@Override
	public MyIterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(Food food) {
		foods.add(food);
	}

}
