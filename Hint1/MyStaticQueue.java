
public class MyStaticQueue {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	private int items[];
	private int numItems;
	private int maxItems;

	// -------------------------------------------------------------------
	// Basic Operation --> Check if myStaticQueue is empty
	// -------------------------------------------------------------------
	public MyStaticQueue(int m) {
		this.maxItems = m;
		this.items = new int[this.maxItems];
		this.numItems = 0;
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Check if MyStaticQueue is empty: isEmpty
	// -------------------------------------------------------------------
	public boolean isEmpty() {
		// check number of items in MyStaticQueue
		if (numItems == 0) {
			return true;
		} else {
			return false;
		}

	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStaticQueue:
	// first
	// -------------------------------------------------------------------
	public int first() {

		return this.items[0];

	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyStaticQueue: add
	// -------------------------------------------------------------------
	public void add(int element) {

		// Rule 1. Valid index and free room
		if ((this.numItems >= 0) && (this.numItems < this.maxItems)) {

			// 1.1. We traverse all existing items from numItems-1 to index, shifting them
			// one position to the right
			for (int i = (this.numItems - 1); i >= this.numItems; i--)
				this.items[i + 1] = this.items[i];

			// 1.2. We add the item at the desired index
			this.items[this.numItems] = element;

			// 1.3. We increase the number of items
			this.numItems = this.numItems + 1;

		}
		// Rule 2. List is full
		else {

			System.out.println("ERROR: MyList is already full");
		}

	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStaticQueue:
	// remove
	// -------------------------------------------------------------------
	public void remove() {

		// Rule 1. No items in a list
		if (this.numItems == 0)
			System.out.println("ERROR: myStaticQueue is already empty");
		else {
			// Rule 2. at least one item in a list
			if ((this.numItems > 0) && (this.numItems <= this.maxItems))
				for (int i = 0; i < (this.numItems - 1); i++)
					this.items[i] = this.items[i + 1];

			// 1.2. We decrease the number of items
			this.numItems = this.numItems - 1;

		}

	}
}
