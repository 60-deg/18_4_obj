
public class MessagePrinterTypeB extends Message implements Printer {
	private String messageB;

	public MessagePrinterTypeB(String message) {
		super(message);
		this.messageB = super.toString();
	}

	@Override
	public void printText() {
		System.out.println(this.messageB);
	}

	@Override
	public void important(boolean important) {
		if (important) {
			this.messageB = "[IMPORTANT] " + super.highlightMessage();
		} else {
			this.messageB = super.toString();
		}
	}

}
