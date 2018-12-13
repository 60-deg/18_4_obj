
public class LineSegment {
	double dx, dy;
	
	// (A)
	protected MyComplex p1, p2;
	
	// (B)
	public LineSegment(MyComplex p1, MyComplex p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	// (C)
	public MyComplex getP1(){
		return this.p1;
	}
	
	public MyComplex getP2(){
		return this.p2;
	}
	
	// (D)
	public double length (){
		this.dx = p1.Re() - p2.Re();
		this.dy = p1.Im() - p2.Im();
		return Math.sqrt(dx*dx + dy*dy);
	}
}
