public class DoublyLinkedList<E> {

	private Node<E> head;
	private Node<E> tail;

	//Size to keep track of number of elements in list.
	private int size = 0;

    /*
	* Inserts an element into a linked list at a given position.
	complexity - O(n)
	*/
	public void add(E value, int position) {
		if (position < 0 || position > size) {
			throw new IllegalArgumentException("Position is Invalid");
		} 
		if (position == 0) { 
			insertAtHead(value);
		} else if (position == size -1) { 
			insertAtTail(value);
		} else { 
			Node<E> currentNode = head;
			for (int i = 0; i < position; i++) {
				currentNode = currentNode.next;
			}
			Node<E> previousNode = currentNode.prev;
			Node<E> newNode = new Node<E>(value);
			newNode.next = currentNode;
			newNode.prev = previousNode;
			previousNode.next = newNode;
			currentNode.prev = newNode;
			size++;
		}
	}

    //Delete the element at given position
	public void remove(int position) {
		if (position < 0 || position >= size) {
			throw new IllegalArgumentException("Position is Invalid.");
		} 
		Node<E> temp = head;
		for (int i = 0; i < position; i++) {
			temp = temp.next;
		}
		Node<E> previousNode = temp.prev;
		Node<E> nextNode = temp.next;
		previousNode.next = nextNode;
		nextNode.prev = previousNode;
		size--;
	}

	/*
	* Inserts a element into a linked list at head position.
	* This can be done in constant time. 
    * Hence, complexity comes out to be O(1)
	*/
	public void insertAtHead(E value) {
		Node<E> newNode = new Node<E>(value);
		if (null == head) { 
			newNode.next = null;
			newNode.prev = null;
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.next = head;
			newNode.prev = null;
			head.prev = newNode;
			head = newNode;
			size++;
		}
	}

	/*
	 Inserts an element into a linked list at tail position.
     Insertion at tail will take O(1) time
	 */
	public void insertAtTail(E value) {
		Node<E> newNode = new Node<E>(value);
		if (null == tail) { 
			newNode.next = null;
			newNode.prev = null;
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.next = newNode;
			newNode.next = null;
			newNode.prev = tail;
			tail = newNode;
			size++;
		}
	}

	

	//Traverse the linked list in forward direction and print
	public void traverseForward() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	//Returns the size of the linked list
	public int size() {
		return size;
	}

	// Returns the Node containing data item after searching for a given index. 
	public Node<E> searchByIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Invalid index passed.");
		} 
		Node<E> temp = head;
		for (int i = 0; i < index; i++) { 
			temp = temp.next;
		}
		return temp;
	}

	//Returns the node containing value passed.
	public Node<E> searchByValue(E value) { 
		Node<E> temp = head;
		while (temp.next != null && temp.data != value) {
			temp = temp.next;
		}
		if (temp.data == value) {
			return temp;
		}
		return null;
	}

	//Delete the element present at head node
	public void deleteFromHead() {
		if (head == null) { 
			return;
		}
		Node<E> temp = head;
		head = temp.next;
		head.prev = null;
		size--;
	}
    public boolean isEmpty() {
		return size == 0;
	}


	//Delete the element present at tail node
	public void deleteFromTail() {
		if (tail == null) { 
			return;
		}
		Node<E> temp = tail;
		tail = temp.prev;
		tail.next = null;
		size--;
	}

	public static final class Node<T> {

		T data;

		Node<T> next;

		Node<T> prev;

		public Node(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}

	}

}