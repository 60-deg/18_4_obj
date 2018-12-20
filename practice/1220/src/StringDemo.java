
public class StringDemo {
	public static void main(String[] args) {
		String strA = args[0];
		String strB = args[1];
 
		int answerA = 0;
		boolean answerB = false;
		String answerC = strA;
		boolean answerD = false;
 
		// (a)
		answerA = strA.length();
 
		// (b)
		answerB =  strA.equals(strB) ? true : false;
 
		// (c)
		answerC = strA.toUpperCase();
  
		// (d)
		answerD = strA.compareTo(strB)<0 ? true : false;
 
 
		System.out.println("Inputs: " + strA + " " + strB);
		System.out.println("(a) " + answerA);
		System.out.println("(b) " + answerB);
		System.out.println("(c) " + answerC);
		System.out.println("(d) " + answerD);
	}
}