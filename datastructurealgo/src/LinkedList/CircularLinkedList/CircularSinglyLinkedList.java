package LinkedList.CircularLinkedList;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node creationOfCircularSinglyLinkedList(int nodeValue){

        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next= node;
        tail = node;
        head = node;
        size = 1;

        return head;

    }

    public void insertCSLL(int nodeValue, int location){

        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            creationOfCircularSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        }else {
            Node tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traversalCSLL(){

        if (head == null){
            System.out.println("Circular Singly Linked List Does Not Exist");
            return;
        }else {

            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("\n");
    }

    public void searchElementCSLL(int element){

        if (head == null){
            System.out.println("Circular Singly Linked List Does Not Exist");
            return;
        }else {

            Node tempNode = head;
            for(int i = 0; i < size; i++){

                if(tempNode.value == element){
                    System.out.println("Element found at position " + i);
                    return;
                }
                tempNode =tempNode.next;

            }

            System.out.println("Element not found");

        }

    }

    public void deleteCSLL(int location){

        if(head == null){
            System.out.println("Circular Singly Linked List Does Not Exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for(int i = 0; i < size-1; i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }else {
            Node tempNode = head;
            for (int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }

    }

    public void deleteAllNode(){
        if(head == null){
            System.out.println("Circular Singly Linked List Does Not Exist");
            return;
        }else {
            tail = head = tail.next = null;
            System.out.println("Circular Singly Linked List has been deleted");
        }

    }

}

//main{
//    CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
//
//    circularSinglyLinkedList.creationOfCircularSinglyLinkedList(8);
//
//    circularSinglyLinkedList.insertCSLL(4, 0);
//
//    circularSinglyLinkedList.insertCSLL(6, 7);
//
//    circularSinglyLinkedList.insertCSLL(2, 1);
//
//    System.out.println(circularSinglyLinkedList.head.value);
//    System.out.println(circularSinglyLinkedList.head.next.value);
//    System.out.println(circularSinglyLinkedList.head.next.next.value);
//    System.out.println(circularSinglyLinkedList.head.next.next.next.value);
//    System.out.println(circularSinglyLinkedList.head.next.next.next.next.value);
//
//
//    circularSinglyLinkedList.traversalCSLL();
//
//    circularSinglyLinkedList.searchElementCSLL(15);
//}
