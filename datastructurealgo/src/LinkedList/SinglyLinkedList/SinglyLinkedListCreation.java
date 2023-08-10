package LinkedList.SinglyLinkedList;

public class SinglyLinkedListCreation {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){

        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;

    }

    public void insertInLinkedList(int nodeValue, int location){

        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }else {
            Node tempNode = head;
            int index = 0;
            while(index < location){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;

    }

    public void traverseSingleLinkedList(){

        if (head == null){
            System.out.println("Singly Linked List Does Not Exist");
            return;
        }else {

            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("\n");

    }

    public void searchValueInSinglyLinkedList(int number){

        if (head == null){
            System.out.println("Singly Linked List Does Not Exist");
            return;
        }else {

            Node tempNode = head;
            for(int i = 0; i < size; i++){

                if(tempNode.value == number){
                    System.out.println("Element found at position " + i);
                    return;
                }
                tempNode =tempNode.next;

            }

            System.out.println("Element not found");

        }

    }

    public void deleteValueInSinglyLinkedList(int location){

        if(head == null){
            System.out.println("Singly Linked List Does Not Exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size-1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
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
            System.out.println("Singly Linked List Does Not Exist");
            return;
        }else {
            tail = head = null;
            System.out.println("Linked List has been deleted");
        }

    }

}

//main{
//    SinglyLinkedListCreation singlyLinkedListEx = new SinglyLinkedListCreation();
//
//    singlyLinkedListEx.createSinglyLinkedList(6);
//
//    System.out.println(singlyLinkedListEx.head.value);
//
//    singlyLinkedListEx.insertInLinkedList(4, 1);
//
//    System.out.println(singlyLinkedListEx.head.next.value);
//
//    singlyLinkedListEx.insertInLinkedList(5, 10);
//    singlyLinkedListEx.insertInLinkedList(7, 5);
//    singlyLinkedListEx.insertInLinkedList(2, 2);
//    singlyLinkedListEx.insertInLinkedList(3, 6);
//    singlyLinkedListEx.insertInLinkedList(9, 0);
//
//    System.out.println(singlyLinkedListEx.head.next.next.value);
//
//    singlyLinkedListEx.traverseSingleLinkedList();
//
//    singlyLinkedListEx.searchValueInSinglyLinkedList(7);
//
//    singlyLinkedListEx.deleteValueInSinglyLinkedList(100);
//
//    singlyLinkedListEx.traverseSingleLinkedList();
//
//    singlyLinkedListEx.deleteAllNode();
//    singlyLinkedListEx.traverseSingleLinkedList();
//}

