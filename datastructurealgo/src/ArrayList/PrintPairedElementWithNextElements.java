package ArrayList;

public class PrintPairedElementWithNextElements {

    public static void pairedElementNext(int[] arr){

        for (int i = 0; i < arr.length; i++){

            for (int j = i+1; j < arr.length; j++){

                System.out.println(arr[i] + "" + arr[j]);

            }
        }

    }

}

//main{
//    int[] arr = {1,2,3,4};
//
//    ArrayList.PrintPairedElement.pairedElementNext(arr);
//}
