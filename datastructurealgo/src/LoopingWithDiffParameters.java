public class LoopingWithDiffParameters {

    public static void printLoopedDifNumbers(int n, int b){

        // this will be O(n)
        for(int x = 0; x <= n; x++){
            // this will be O(b)
            for(int i = 0; i <= b; i++){

                System.out.println(x+""+i);

            }

        }

        // this code will have the time complexity of O(n) * O(b)
        //because the code have a loop and in that loop exist another loop
        //if we add another loop it will increase the power of time complexity of the program.

        // this will be the O(n)
        for(int j = 0; j <= n; j++){
            System.out.println(j);
        }

        //this will be the O(b)
        for(int f = 0; f <= b; f++){

            System.out.println(f);

        }

        //the program will take the time complexity of O(n) + O(b)

    }



}
