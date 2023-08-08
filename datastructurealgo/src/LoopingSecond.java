public class LoopingSecond {

    public static void LoopingTwoTime(int n){

        // this will be O(n)
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }

        // this will be O(n)
        for(int j = 0; j <= n; j++){
            System.out.println(j);
        }

        //which will sum up to the O(2n)
        // and the we drop the constant for the O
        //so the time complexity becomes O(n)

    }

}
