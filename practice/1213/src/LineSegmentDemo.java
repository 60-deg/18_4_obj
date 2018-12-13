class LineSegmentDemo {
    public static void main(String[] args) {
    	MyComplex p1 = new MyComplex(4,1);
		MyComplex p2 = new MyComplex(1,5);
		LineSegment l = new LineSegment(p1, p2);
		System.out.println(l.getP1().Re());
		System.out.println(l.getP1().Im());
		System.out.println(l.getP2().Re());
	 	System.out.println(l.getP2().Im());
		System.out.println(l.length());
    }
}