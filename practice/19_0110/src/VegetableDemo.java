
public class VegetableDemo {
	public static void main(String[] args) {
		Vegetable a = new Carrot();
		Vegetable b = new Tomato();
		Vegetable c = new Lettuce();
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
		System.out.println(a.getColor());
		System.out.println(b.getColor());
		System.out.println(c.getColor());
	}
}
