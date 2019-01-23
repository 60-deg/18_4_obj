import java.util.Iterator;

public class FridgeIterator implements MyIterator {
	private Iterator<Food> itr;

	public FridgeIterator(Iterator<Food> newItr){
		this.itr = newItr;
	}

	@Override
	public Object next() {
		return this.itr.next();
	}

	@Override
	public boolean hasNext() {
		return this.itr.hasNext();
	}

}
