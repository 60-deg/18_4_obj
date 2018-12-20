package adv3_7;

public class SolverDemo {
    public static void main(String[] args) {
    	double a, b, c;
    	a = 2;
    	b = 5;
    	c = -1;
    	double[] x = MySolver.quadraticSolver(a, b, c);
 
    	if(x != null) {
    		System.out.println("Solutions:");
    		for(int i = 0; i < x.length; i++) {
    			System.out.println(x[i]);
    		}
    	} else {
    		System.out.println("No Solution");
    	}
    }
}