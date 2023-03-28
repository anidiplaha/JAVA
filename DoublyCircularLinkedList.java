class Node {
    int data;
    Node next;
    Node prev;
};

class DoublyCircularLinkedList{
  Node head;
  LinkedList(){
    head = null;
  }  
}; 
public class Implementation { 
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();
    Node first = new Node();
    first.data = 10;
    first.next = null; 
    first.prev = null;
    MyList.head = first;
    first.next = MyList.head;
    MyList.head.prev = first;

    Node second = new Node();
    second.data = 20;
    second.next = null; 
    second.prev = first;
    first.next = second;
    second.next = MyList.head;
    MyList.head.prev = second;

    Node third = new Node();
    third.data = 30;
    third.next = null; 
    third.prev = second;
    second.next = third;
    third.next = MyList.head;
    MyList.head.prev = third;
  }
}