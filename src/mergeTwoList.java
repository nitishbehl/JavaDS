class mergeSortList {

    Node head;

    public static Node mergeSortList(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        Node third;

        if (head1.data <= head2.data) {
            third = head1;
            head1 = head1.next;
        } else {
            third = head2;
            head2 = head2.next;
        }

        Node last = third;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                last.next = head1;
                last = head1;
                head1 = head1.next;
            } else {
                last.next = head2;
                last = head2;
                head2 = head2.next;
            }

            last.next = null;

            if (head1 != null) {
                last.next = head1;
            } else {
                last.next = head2;
            }
        }
        return third;
    }

    public static void main(String args[]) {

        mergeSortList list1 = new mergeSortList();
        mergeSortList list2 = new mergeSortList();


        list1.insert(new Node(5));
        list1.insert(new Node(10));
        list1.insert(new Node(15));


        list2.insert(new Node(2));
        list2.insert(new Node(3));
        list2.insert(new Node(20));

        Node head = mergeSortList(list1.head, list2.head);
        LinkedList list = new LinkedList(head);
        list.printList();
    }

    public void insert(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
