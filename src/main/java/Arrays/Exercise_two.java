package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Exercise_two {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        int i = al.indexOf(3);

        System.out.println("First Ocurrence of 2 is at Index:" +i);

        int l = al.lastIndexOf(3);

        System.out.println("Last Ocurrence of 2 is at Index: " +l);
    }
}
