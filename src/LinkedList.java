public class LinkedList {

    Node head;

    LinkedList(Node head) {
        this.head = head;
    }


    public static void main(String[] args) {
        Node head = new Node(1);

        LinkedList linkedList = new LinkedList(head);

        linkedList.insert(7);
        linkedList.insert(7);
        linkedList.insert(3);

        System.out.println("Count of 3 is " + linkedList.count(3));

        //linkedList.head.next.next.next.next = linkedList.head;
        // linkedList.containLoop();


        //   linkedList.printMiddle(head);


//        System.out.println("List before removal of duplicates");
//        linkedList.printList();
//        linkedList.removeDuplicate();
//        System.out.println("List after removal of elements");
//        linkedList.printList();


        // linkedList.printNthFromLast(4);


        //System.out.println("Element at index 3 is "+linkedList.GetNth(3));
//        if (linkedList.search(linkedList.head, 7))
//            System.out.println("Yes");
//        else
//            System.out.println("No");


        // System.out.println("Count of nodes is " +
        //        linkedList.getCount());


        //System.out.println("\nCreated Linked list is:");
        //linkedList.printList();
        //linkedList.deleteNodeAtPosition(4);
        //System.out.println("\nLinked List after Deletion at position 4:");
        //linkedList.printList();
    }


    public void insert(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node node = new Node(data);
        node.next = prevNode.next;
        prevNode.next = node;
    }


    void deleteNode(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = null;
        Node last = head;

        while (last.next != null) {
            last = last.next;
            last.next = node;
            return;
        }
    }

    public void printList() {
        Node tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    void deleteNodeAtPosition(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;

            if (temp == null || temp.next == null) {
                return;
            }
            Node next = temp.next.next;
            temp.next = next;
        }
    }

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int GetNth(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
        assert (false);
        return 0;
    }

    void printNthFromLast(int n) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        if (length < n)
            return;
        temp = head;
        for (int i = 1; i < length - n + 1; i++) {
            temp = temp.next;

        }
        System.out.println(temp.data);
    }

    void removeDuplicate() {
        Node current = head;
        while (current != null) {
            Node temp = current;
            while (temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    void printMiddle(Node head) {
        int count = 0;
        Node mid = head;
        while (head != null) {
            if ((count % 2) == 1)
                mid = mid.next;
            ++count;
            head = head.next;
        }
        if (mid != null)
            System.out.println("The middle element is " +
                    mid.data + "\n");
    }

    int countNodes(Node n) {
        int result = 1;
        Node temp = n;
        while (temp.next != n) {
            result++;
            temp = temp.next;
        }
        return result;
    }

    void containLoop() {
        Node p = head;
        Node q = head;
        int flag = 0;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Loop found");
        } else {
            System.out.println("Loop not found");
        }
    }


    int count(int search_for) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == search_for)
                count++;
            current = current.next;
        }
        return count;
    }

    int countNodesInLoop(Node list) {
        Node p = list, q = list;
        while (p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q)
                return countNodes(p);
        }
        return 0;
    }
}






