package Queue;

public class QueueArray {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){

        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue has been created with size: " + size);

    }

    public boolean isFull(){

        return topOfQueue == arr.length - 1;

    }

    public boolean isEmpty(){

        return (beginningOfQueue == -1) || (beginningOfQueue == arr.length);

    }

    public void enQueue(int value){

        if (isFull()){
            System.out.println("The queue is full");
            return;
        }else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted the " + value + " position in the queue");
            return;
        }else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted the " + value + " position in the queue");
            return;
        }

    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }else {
            return arr[beginningOfQueue];
        }
    }

    public void deleteQueue(){

        arr = null;
        System.out.println("The queue has been deleted successfully");

    }

}
