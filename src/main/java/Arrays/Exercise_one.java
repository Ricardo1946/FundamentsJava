package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Exercise_one {
    public static void main(String[] args) {

        List<String> li = new ArrayList<>();

        li.add("Java");
        li.add("Python");
        li.add("JavaScript");
        li.add("C++");
        li.add("Go");

        System.out.println("ELEMENTS OF LIST ARE: ");

        for(String s: li){
            System.out.println(s);
        }

        System.out.println("elements at Index 1: " +
                li.get(1));

        li.set(1, "JavaScript");
        System.out.println("Updated List: " + li);
        li.remove("C++");
        System.out.println("List after Removing Element: " + li);
    }
}
