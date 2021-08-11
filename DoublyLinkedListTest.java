
package com.deepak.data.structures.LinkedList;

import org.junit.Assert;
import org.junit.Test;


public class DoublyLinkedListTest {


	@Test
	public void testDeleteFromPosition() {
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<>();
		Assert.assertTrue(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 0);
		doublyList.insertAtHead("123");
		doublyList.insertAtHead("456");
		Assert.assertFalse(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 3);
		doublyList.deleteFromPosition(1);
		Assert.assertTrue(doublyList.size() == 2);
		Assert.assertEquals(doublyList.searchByIndex(1).item, "123");
	}
    
	@Test
	public void testInsertionAtHead() {
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<>();
		Assert.assertTrue(doublyList.size() == 0);
		doublyList.insertAtHead("123");
		Assert.assertFalse(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 1);
		doublyList.insertAtHead("456");
		Assert.assertTrue(doublyList.size() == 2);
		Assert.assertEquals(doublyList.searchByIndex(0).item, "456");
	}

	@Test
	public void testInsertionAtTail() {
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<>();
		Assert.assertTrue(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 0);
		doublyList.insertAtHead("123");
		Assert.assertFalse(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 1);
		doublyList.insertAtTail("456");
		Assert.assertTrue(doublyList.size() == 2);
	}

	@Test
	public void testInsertionAtPosition() {
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<>();
		Assert.assertTrue(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 0);
		doublyList.insertAtHead("123");
		doublyList.insertAtHead("456");
		Assert.assertFalse(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 2);
		doublyList.insertAtPosition("789", 1);
		Assert.assertTrue(doublyList.size() == 3);
	}

	/**
	 * Test case to check deletion from head
	 */
	@Test
	public void testDeleteFromHead() {
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<>();
		Assert.assertTrue(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 0);
		doublyList.insertAtHead("123");
		doublyList.insertAtHead("456");
		Assert.assertFalse(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 2);
		doublyList.deleteFromHead();
		Assert.assertTrue(doublyList.size() == 1);
	}

	@Test
	public void testDeleteFromTail() {
		DoublyLinkedList<String> doublyList = new DoublyLinkedList<>();
		Assert.assertTrue(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 0);
		doublyList.insertAtHead("123");
		doublyList.insertAtHead("456");
		Assert.assertFalse(doublyList.isEmpty());
		Assert.assertTrue(doublyList.size() == 2);
		doublyList.deleteFromTail();
		Assert.assertTrue(doublyList.size() == 1);
	}


}