class HeaderLinkedList {
	static class link {
		int info;
		link next;
	};
	static link start = null;
	static link create_header_list(int data)
	{

		link new_node, node;
		new_node = new link();
		new_node.info = data;
		new_node.next = null;
		if (start == null) {

			start = new link();
			start.next = new_node;
		}
		else {

			node = start;
			while (node.next != null) {
				node = node.next;
			}
			node.next = new_node;
		}
		return start;
	}

	static link display()
	{
		link node;
		node = start;
		node = node.next;

		while (node != null) {

			System.out.printf("%d ", node.info);
			node = node.next;
		}
		System.out.printf("\n");
		return start;
	}

	public static void main(String[] args)
	{
		create_header_list(11);
		create_header_list(12);
		create_header_list(13);

		System.out.printf("List After inserting"
						+ " 3 elements:\n");
		display();
		create_header_list(14);
		create_header_list(15);
		System.out.printf("List After inserting"
						+ " 2 more elements:\n");
		display();
	}
}

