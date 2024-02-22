package com.ruby.java.ch08;

public class MyLinkedList2 {
	private Node head;

	class Node {
		private String data;
		private Node link;

		public Node(String data, Node link) {
			this.data = data;
			this.link = link;
		}

	}

	public void add(String data) {
		Node newNode = new Node(data);
		if( head == null)
			head = newNode;
	}

	public MyLinkedList2(Node head) {
		this.head = head;
	}
}
