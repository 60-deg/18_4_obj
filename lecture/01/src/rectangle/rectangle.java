package rectangle;

class Rectangle {
	int width;
	int height;
	Rectangle (){
		width = 0;
		height = 0;
	}
	Rectangle (int w, int h){
		setSize(w,h);
	}
	void setSize(int w, int h){
		width = w;
		height = h;
	}
	int getArea(){
		return width*height;
	}
}


class NamedRectangle extends Rectangle{
	String name;
	NamedRectangle(){
			name = "No Name";
	}
	NamedRectangle(String name){
			this.name = name;
	}

	public static void main(String[] args){
			NamedRectangle nr = new NamedRectangle();
			nr.setSize(123,45);
			System.out.println(nr.getArea());
	}
}