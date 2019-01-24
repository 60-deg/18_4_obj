
public class MessagePrinterTypeA implements Printer {
	private Message message;
	private Boolean isImportant = false;

	public MessagePrinterTypeA(String msg) {
		this.message = new Message(msg);
	}

	@Override
	public void printText() {
		if (this.isImportant) {
			System.out.println("[IMPORTANT] " + message.highlightMessage());
		} else {
			System.out.println(message.toString());
		}
	}

	@Override
	public void important(boolean important) {
		this.isImportant = important;
	}

}
