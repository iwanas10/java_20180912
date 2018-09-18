package days.fourth;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<String> name = new TreeSet<>();
        name.add("Jonas");
        name.add("Andrius");
        name.add("Antanas");
        name.add("Jonas");
        name.add("Petras");
        name.forEach(System.out :: println);

    }
}
