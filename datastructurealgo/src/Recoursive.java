public class Recoursive {

    // this will not take memory as the first recursive one
    // the space complexity for this program is O(1)
    public static int pairSumSequence(int n){

        int total = 0;
        for(int i = 0; i <= n; i++){

            total = total + pair(i , i+1);
        }

        return total;

    }

    private static int pair(int a, int b){

        return a+b;

    }

}
