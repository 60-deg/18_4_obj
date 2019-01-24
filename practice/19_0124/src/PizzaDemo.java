public class PizzaDemo {
	public static void main(String[] args) {
		Pizza p1 = new ItalianPizza();
		Pizza p2 = new CrispyPizza();
		Pizza p3 = new SeafoodToppingPizza(new ItalianPizza());
		Pizza p4 = new SeafoodToppingPizza(new CrispyPizza());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}