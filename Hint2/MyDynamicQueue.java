
public class MyDynamicQueue  {

	// --------------------------------------------------
	// Attributes
	// --------------------------------------------------
	/**
	 * @param items:
	 *            It stores the items of MyList.
	 * @param numItems:
	 *            It represents the number of items of MyList.
	 * @param maxItems:
	 *            It represents the maximum number of items a MyList can contain.
	 */
	private MyNode head;
	private int numItems;

	// -------------------------------------------------------------------
	// Basic Operation --> Create an empty myList: my_create_empty
	// -------------------------------------------------------------------
	// public myList my_create_empty(){}

	/**
	 * The constructor creates 1 instance (1 object) of the class MyStaticList<br>
	 */
	public MyDynamicQueue() {
		this.head = null;
		this.numItems = 0;
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Check if MyDynamicQueue is empty: isEmpty
	// -------------------------------------------------------------------
	public boolean isEmpty() {
		if (this.head == null && this.numItems == 0) {
			return true;
		} else {
			return false;
		}
	}

	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyDynamicQueue:
	// first
	// -------------------------------------------------------------------
	public int first() {
		if(isEmpty() != true) {
		MyNode currentNode = this.head;
		return currentNode.getInfo();
		}
		else {
			return 0;
		}
	}

	// -------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyDynamicQueue: add
	// -------------------------------------------------------------------
	public void add(int element){
		
		
		MyNode newNode = null;
		MyNode currentNode = null;
		
if(this.isEmpty() != true){
	//1. We declare a reference node to head, and another one pointing to its previous node. 
		//We also declare a count of the elements we have traversed so far
		currentNode = head;
		int count = 0;
		//2. We look for the place the node should be inserted  
		while (count < this.numItems){
		//2.2. We make current to point to its next node
			currentNode = currentNode.getNext();
		//2.3. We increase the amount of nodes visited so far.
			count = count + 1;
}}
else {
	newNode = new MyNode(element, null);
	newNode.setInfo(numItems);
	//1. We declare a reference node to head, and another one pointing to its previous node. 
	//We also declare a count of the elements we have traversed so far
	
	}
		
	}
	


	// -------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyDynamicQueue:
	// remove
	// -------------------------------------------------------------------
	public void remove() {
		if (isEmpty() == true) {
			System.out.println("Error: myDynamicQueue is already empty");
		} else {
			
		}
	}

}
