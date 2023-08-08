public class NestedLoop {

    public static void printLoopedNumbers(int n){

        // this will be O(n)
        for(int x = 0; x <= n; x++){
            // this will be O(n)
            for(int i = 0; i <= n; i++){

                System.out.println(x+""+i);

            }

        }

        // this code will have the time complexity of O(n^2)
        //because the code have a loop and in that loop exist another loop
        //if we add another loop it will increase the power of time complexity of the program.

    }

}
