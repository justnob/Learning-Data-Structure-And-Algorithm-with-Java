import java.util.Arrays;

public class TwoDimArray {

    int[][] arr = null;

    public TwoDimArray(int numberOfRow, int numberOfColumn){

        this.arr = new int[numberOfRow][numberOfColumn];
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr.length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    //O(1)
    public void insertInArray(int row, int col, int value){

        try{
            if(arr[row][col] == Integer.MIN_VALUE){

                arr[row][col] = value;
                System.out.println("Value Added In Array");
            }
            else{

                System.out.println("Value Could Not Be Added In Array");

            }
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Out Of The world Bro!");

        }

    }

    public void getElementByRowCol(int row, int col){

        try{
            if(arr[row][col] != Integer.MIN_VALUE){

                System.out.println(arr[row][col]);

            }
            else {

                System.out.println("Element not found");

            }
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Brooooooo!");

        }

    }

    public String getElement(int value){

        try{
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){

                    if(arr[i][j] == value){

                        return "Element Found";

                    }

                }
            }
        }catch (Exception e){

            return "Brrroooooo!";

        }

        return "Element Not Found";

    }

    public void deleteArray(int row, int col){

        try{

            if(arr[row][col] != Integer.MIN_VALUE){

                arr[row][col] = Integer.MIN_VALUE;
                System.out.println("Element has been deleted!");

            }else{

                System.out.println("Element could not be deleted");

            }

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Brooooooo!");

        }

    }

}

//main{
    // O(MN)
//    int[][] arr;
//    arr = new int[2][2];
//
//    arr[0][0] = 1;
//    arr[0][1] = 2;
//    arr[1][1] = 4;
//    arr[1][0] = 3;
//
//    System.out.println(Arrays.deepToString(arr));

    //O(1) time complexity
    //O(mn) space complexity
//    String arrg[][] = {{"amar", "nath"}, {"sah", "hu!"}};
//
//    System.out.println(Arrays.deepToString(arrg));

//        TwoDimArray sda = new TwoDimArray(2,2);
//
//        sda.insertInArray(0,0,1);
//        sda.insertInArray(0,1,2);
//        sda.insertInArray(1,0,3);
//        sda.insertInArray(1,1,4);
//        sda.insertInArray(0,0,5);
//        sda.insertInArray(5,7,6);
//
//        System.out.println(Arrays.deepToString(sda.arr));
//
//        sda.getElementByRowCol(1,1);
//
//        System.out.println(sda.getElement(2));
//
//        sda.deleteArray(1,1);
//
//        System.out.println(Arrays.deepToString(sda.arr));

//}