public class PrinterDemo {
	public static void main(String[] args) {
		Printer pa = new MessagePrinterTypeA("I will go to Tokyo.");
		pa.printText();
		pa.important(true);
		pa.printText();
 
		Printer pb = new MessagePrinterTypeB("I will go to Tokyo.");
		pb.printText();
		pb.important(true);
		pb.printText();
	}
}