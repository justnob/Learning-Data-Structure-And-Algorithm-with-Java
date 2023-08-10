package Array;

import java.util.Scanner;

public class AvargaeWithotArray {

    public static void getAverage(){

        Scanner console = new Scanner(System.in);

        System.out.println("******************* Welcome To Money Average Calculator **********************");
        System.out.println();
        System.out.println("Enter the number of person?");
        int person = console.nextInt();
        int sum = 0;

        for (int i = 1; i <= person; i++){

            System.out.println("Enter the amount " + i + " person");
            int money = console.nextInt();
            sum =+ money;

        }

        double average = sum / person;

        System.out.println("The total average between "+ person+ " peoples is: "+ average);

    }

}
