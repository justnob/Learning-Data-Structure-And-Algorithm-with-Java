package ArrayList;

public class PrintPairedElement {

    public static void pairedElement(int[] arr){

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length; j++){

                System.out.println(arr[i] + "" + arr[j]);

            }
        }

    }

}

//main{
//    int[] arr = {1,2,3,4};
//
//    ArrayList.PrintPairedElement.pairedElement(arr);
//}
