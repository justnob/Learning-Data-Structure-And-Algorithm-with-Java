package Stack;

public class StackWithArray {

    int[] arr;
    int topOfStack;


    public StackWithArray(int size){

        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with the size: " + size);

    }

    public boolean isEmpty(){

        if (topOfStack == -1){
            return true;
        }else {
            return false;
        }

    }

    public boolean isFull(){

        if (topOfStack == arr.length-1){
            System.out.println("The Stack Is Full");
            return true;
        }else {
            return false;
        }

    }

    public void push(int value){

        if (isFull()){
            System.out.println("Stack is full");
        }else {

            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");

        }

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack Is Empty");
            return -1;
        }else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The Stack Is Empty");
            return -1;
        }else {
            return arr[topOfStack];
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted");
    }

}

//main{
//    Stack stack = new Stack(4);
//    stack.push(1);
//    stack.push(2);
//    stack.push(3);
//    stack.push(4);
//
//    int result = stack.peek();
//
//    System.out.println(result);
//
//    stack.deleteStack();
//}
