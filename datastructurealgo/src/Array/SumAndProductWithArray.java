package Array;

public class SumAndProductWithArray {
    
    public static void sum(int[] abj){

        int sum = 0;

        for(int i = 0; i < abj.length; i++){

            sum += abj[i];

        }

        System.out.println(sum);

    }

    public static void product(int[] abj){

        int pro = 1;

        for (int i = 0; i < abj.length; i++){

            pro *= abj[i];

        }

        System.out.println(pro);

    }

}

//main{
//    int[] abj = {1,2,3,45,6,7};
//
//    Array.SumAndProductWithArray.product(abj);
//}
