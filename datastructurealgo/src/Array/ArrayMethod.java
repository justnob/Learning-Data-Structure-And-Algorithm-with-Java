package Array;

public class ArrayMethod {

    int[] arr = null;

    // this has O(n) time complexity
    public ArrayMethod(int arraySize){

        arr = new int[arraySize];
        for(int i = 0; i < arr.length; i++){

            arr[i] = Integer.MIN_VALUE;

        }

    }

    public void insert(int location, int value){

        try{
            if(arr[location] == Integer.MIN_VALUE){

                arr[location] = value;
                System.out.println("inserted successfully in location");

            }else{

                System.out.println("value already exist");

            }
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Invalid index to insert array");

        }

    }

    public String findvalue(int number){

        try{
            for(int i = 0; i < arr.length; i++) {

                if (arr[i] == number) {
                    return "Element found";
                }

            }
        }catch (Exception e){
            return "Brooooooooo!";
        }
        return"Element not found";
    }

    public String deletevalue(int numbers){

        try{

            for(int j = 0; j < arr.length; j++){

                if(arr[j] == numbers){
                    arr[j] = Integer.MIN_VALUE;

                    return "Element Deleted";
                }

            }

        }catch (Exception e){

            return "Brooooooooo!";

        }

        return "Number Not Found";

    }

}

//main{
//    Array.ArrayMethod arraying = new Array.ArrayMethod(4);
//
//    arraying.insert(0, 1);
//    arraying.insert(1, 2);
//    arraying.insert(2, 3);
//    arraying.insert(3, 4);
//    arraying.insert(0, 5);
//    arraying.insert(8, 6);
//
//    var firstElement = arraying.arr[0];
//
//    System.out.println(firstElement);
//
//    System.out.println(arraying.findvalue(2));
//
//    System.out.println(arraying.deletevalue(2));
//
//    var justElement = arraying.arr[1];
//
//    System.out.println(justElement);
//}
