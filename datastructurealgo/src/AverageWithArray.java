import java.util.Scanner;

public class AverageWithArray {

    public static void getAverage(){

        Scanner console = new Scanner(System.in);

        System.out.println("******************* Welcome To Money Average Calculator **********************");
        System.out.println();
        System.out.println("Enter the number of person?");
        int person = console.nextInt();

        int[] money = new int[person];

        int sum = 0;

        for (int i = 0; i < person; i++){

            System.out.println("Enter the amount " + (i+1) + " person");
            money[i] = console.nextInt();
            sum = money[i] + sum;

            System.out.println(sum);

        }

        double average = sum / person;
        int counter = 0;
        for (int j = 0; j < money.length; j++){

            if (money[j] >= average){

                counter++;

            }

        }

        System.out.println("The total average between "+ person+ " peoples is: "+ average);
        System.out.println(counter + " Person gave more or equals to the average money");

    }

}
