public class RecurssionExample {

    //the space complexity for this program is O(n)
    public static int recursionNumber(int n){

        if(n <= 0){
            return 0;
        }

        return n + recursionNumber(n-1);

    }

    // it will use the stack to store each of the numbers and at end add them up.

}
