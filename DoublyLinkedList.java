import java.util.*;
class DoublyLinkedList{

	static class Node {
		int data;
		Node next;
		Node prev;
	};

	static Node head_ref;
	static void push(int new_data)
	{
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = head_ref;
		new_node.prev = null;
		if (head_ref != null)
			head_ref.prev = new_node;
		head_ref = new_node;
	}
	static void printList(Node node)
	{
		Node last = null;

		System.out.print("\nTraversal in forward"
						+ " direction \n");
		while (node != null) {
			System.out.print(" " + node.data + " ");
			last = node;
			node = node.next;
		}

		System.out.print("\nTraversal in reverse"
						+ " direction \n");

		while (last != null) {
			System.out.print(" " + last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args)
	{
		head_ref = null;

		push(6);
		push(7);
		push(1);

		System.out.print("Created DLL is: ");
		printList(head_ref);
	}
}

