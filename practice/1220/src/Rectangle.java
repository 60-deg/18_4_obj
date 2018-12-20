
public class Rectangle extends Figure{
	private double width, height;
	public Rectangle(double w, double h){
		this.width = w;
		this.height = h;
	}
	
	@Override
	public double area(){
		return this.width * this.height;
	}
}
