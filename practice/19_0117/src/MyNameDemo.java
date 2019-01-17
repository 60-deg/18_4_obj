
public class MyNameDemo {
	public static void main(String[] args) {
		MyName myname;
		if(args.length < 2) return;
		if("jp".equals(args[0])) {
			myname = new MyNameJp();
		} else {
			myname = new MyNameEn();
		}
		System.out.println("Language:" + myname.getLanguage());
		myname.sayName(args[1]);
	}
}
