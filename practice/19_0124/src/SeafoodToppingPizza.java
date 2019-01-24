
public class SeafoodToppingPizza implements Pizza {
	private String name;

	public SeafoodToppingPizza(Pizza pizza) {
		this.name = "Seafood" + pizza.toString();
	}

	public String toString() {
		return this.name;
	}

}
