public class FigureDemo {
    public static void main(String[] args) {
    	Figure c = new Circle(2);
    	Figure r = new Rectangle(2, 3);
    	Figure s = new Square(3);
    	System.out.println(c.area());
    	System.out.println(r.area());
    	System.out.println(s.area());
    }
}