public class Message {
	private String message;
	public Message(String message) {
		this.message = message;
	}
	public String highlightMessage() {
		return message.toUpperCase();
	}
	public String toString() {
		return message;
	}
}