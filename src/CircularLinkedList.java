public class CircularLinkedList {
    Node head;

    LinkedList(Node head) {
        this.head = head;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.CreateCircularLinkedList();

        cll.insertFirst(10);
        cll.insertFirst(15);
        cll.insertFirst(25);
        printList();

        cll.deletion(1);
        cll.deletion(8);
        cll.deletion(10);
        printList();

    }

    void CreateCircularLinkedList() {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = first;

    }

    public void printList() {
        Node tempNode = head;

        while (tempNode.next != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.prinln(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public int getLength() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = node;
        node.next = head;
        head = node;
    }

    public void deletion() {
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        Node last = temp;
        Node first = last.next;
        last.next = first.next;
        first = first.next;
        head = first;

    }
}