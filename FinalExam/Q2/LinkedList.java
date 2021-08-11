public class LinkedList<T>
{
	Node<T> head;

	public void add(T data)
	{
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}

	public void append(T data)
	{
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = null;
		if (head == null)
		{
			head = newNode;
		}
		else 
		{
			Node<T> tempNode = head;
			while(tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}

	public void insertAfter(Node<T> prevNode, T data)
	{
		Node <T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public T pop()
	{
		if (head == null)
		{
			return null;
		}
		Node<T> tempNode = head;
		head = head.next;
		return tempNode.data;
	}

	public T popLast()
	{
		Node<T> tempNode = head;
		while(tempNode.next.next!= null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = null;
		return tempNode.data;
	}

	public void search (T key)
	{
		Node<T> tempNode = head;
		while(tempNode != null)
		{
			if(tempNode.data == key)
			{
				System.out.println("Key found");
				break;
			}
			tempNode = tempNode.next;
		}
	}
    
	public void insertAfterNode(T key,T data)
	{
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		Node<T> tempNode = head;
		while(tempNode.data != key)
		{
			tempNode = tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
    
	public void deleteNode(T key)
	{
		Node<T> tempNode = head;
		Node<T> prevNode = head;
		while(tempNode.data != key)
		{
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = tempNode.next;
	}

	public void size()
	{
		Node<T> tempNode = head;
		int count = 0;
		while (tempNode != null)
		{
			count++;
			tempNode = tempNode.next;
		}
		System.out.println("Size is: "+count);
	}

	public void print()
	{
        System.out.println("========Data========");
		Node<T> tempNode = head;
		while(tempNode != null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
        System.out.println("========Data========");
	}
}