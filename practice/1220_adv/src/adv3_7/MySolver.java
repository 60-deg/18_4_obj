package adv3_7;

public class MySolver {
	public static double[] quadraticSolver(double a, double b, double c){
		double[] ret = new double[2];
		ret[0] = (-b + Math.sqrt(b*b - 4*a*c) )/(2*a);
		ret[1] = (-b - Math.sqrt(b*b - 4*a*c) )/(2*a);
		return ret;
	}
}
