package practice;

//(ch08_연결리스트와배열)
class Node3 {
	int data;
	Node3 link;

	public Node3(int data) {
		this.data = data;
		link = null;
	}
}

//------------------------
class LinkedList3 {
	Node3 first; // Node3 타입으로 first할당

	void append(int data) {
		Node3 p = first, q = null;

		Node3 newNode = new Node3(data); // Node3 주소값

		if (first == null) {
			first = newNode;
			return; // null일 때 생성
		} else {
			while (p != null) {
				q = p;
				p = p.link;
			}
			q.link = newNode; //
		}

		/*
		 * Node3 p = first; while (p.link != null) { p = p.link; } p.link = newNode;
		 */ }

	public LinkedList3() {
		first = null;
	}

//******************************************
	void showList() {
		System.out.print("LinkedList: ");
		Node3 p = first;

		while (p != null) {
			System.out.print(p.data + " ");
			p = p.link;
		}
		System.out.println();
	}

//*******************************************
	void insert(int data) {
		Node3 newNode = new Node3(data);
		if (first == null || first.data >= data) {
			// Insert at the beginning if the list is empty or new data is smaller than the
			// first node
			newNode.link = first;
			first = newNode;
		} else {
			Node3 p = first, q = null;
			while (p != null && p.data < data) {
				q = p;
				p = p.link;
			}

			// Insert the new node at the correct position
			newNode.link = p;
			q.link = newNode;
		}
	}
}

//------------------------
public class Test05 {

	static int getList(int[] data) {
		int count = 0;
		int mid = data.length / 2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5;
			count++;
		}
		return count;
	}

//-------------------------
	static void showList(int[] data) {

		System.out.print("ArrayList: ");
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10) {
				System.out.print(" ");
			}
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

//--------------------------------
	static int insertList(int[] data, int count, int x) {
		int indx = 0;
		while (indx < count) {
			if (x < data[indx]) {
				// ---------------------------
				while (indx <= count) {
					int temp = data[indx];
					data[indx] = x;
					// --------------------------------
					x = temp;
					indx++;
				}
				break;
			} else {
				indx++;
			}
		}

		return ++count;

	}

//----------------------------------
	public static void main(String[] args) {
		int[] list = new int[10];
		int count = 0;
		System.out.println("*** ArrayList ***");
		count = getList(list);
		//
		showList(list);
		count = insertList(list, count, 3);
		showList(list);
		count = insertList(list, count, 7);
		showList(list);
//--------------------------------------------
		System.out.println();
		System.out.println("*** LinkedList ***");

		LinkedList3 ll = new LinkedList3();
		ll.append(5);
		ll.append(10);
		ll.append(15);
		ll.append(20);
		ll.append(25);
		ll.showList();
		ll.insert(3);
		ll.showList();
		ll.insert(7);
		ll.showList();
	}
}