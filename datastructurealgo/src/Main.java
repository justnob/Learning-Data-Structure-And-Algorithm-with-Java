import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>(Arrays.asList("gave", "lape"));

        fruit.add("apple");
        fruit.add("Banana");

        fruit.set(0, "cat");



        //fruit.remove("cat");

        String s = fruit.get(1);

        fruit.forEach(System.out::println);

        System.out.println(s);

    }
}