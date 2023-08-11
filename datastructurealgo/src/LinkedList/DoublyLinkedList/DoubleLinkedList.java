package LinkedList.DoublyLinkedList;

public class DoubleLinkedList {

    public DoubleNode head;
    public DoubleNode tail;
    int size;

    public DoubleNode createDLL(int nodeValue){

        head = new DoubleNode();
        DoubleNode doubleNode = new DoubleNode();
        doubleNode.value = nodeValue;
        doubleNode.next = null;
        doubleNode.prev = null;
        head = tail = doubleNode;
        size = 1;
        return head;
    }

    public void insertDLL(int nodeValue, int location){

        DoubleNode newNode = new DoubleNode();

        if (head == null){
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location <= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void traverseDLL(){



    }

}
