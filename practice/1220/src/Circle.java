
public class Circle extends Figure {
	private double radius;
	final double pi = 3.14;
	Circle(double r){
		this.radius = r;
	}
	
	@Override
	public double area(){
		return this.radius * this.radius * pi;
	}
}
