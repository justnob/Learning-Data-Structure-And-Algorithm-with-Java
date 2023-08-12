import Queue.QueueArray;

public class Main {

    public static void main(String[] args) {

        QueueArray queueArray = new QueueArray(4);

        boolean result = queueArray.isFull();
        System.out.println(result);

        boolean result2 = queueArray.isEmpty();
        System.out.println(result2);

        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.enQueue(4);
        queueArray.enQueue(5);

        boolean result3 = queueArray.isFull();
        System.out.println(result3);

        boolean result4 = queueArray.isEmpty();
        System.out.println(result4);

        int result7 = queueArray.peek();
        System.out.println(result7);

        int result5 = queueArray.deQueue();
        System.out.println(result5);

        int result6 = queueArray.deQueue();
        System.out.println(result6);

        queueArray.deleteQueue();

    }

}