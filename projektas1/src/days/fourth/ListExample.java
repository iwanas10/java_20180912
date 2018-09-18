package days.fourth;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> numbers =new ArrayList<>();
 numbers.add(3);
        numbers.add(109);
 numbers.add(2);
 numbers.add(55);
 numbers.add(1);
 numbers.add(90);
        System.out.println(numbers.contains(55));
        System.out.println(numbers.get(4));
        System.out.println(numbers.isEmpty());
        numbers.forEach(System.out::println);

    }

}
