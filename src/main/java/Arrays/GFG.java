package Arrays;

import java.util.LinkedHashSet;

/**
 * Java Program to remove Duplicate Elements from an Array
 * Given an array, the task is to remove the duplicate elements from an array.
 * The simplests method to remove duplicates from an array. is using a set,
 * which automatically eliminates duplicates. This method can be used even if
 * the array is not sorted.
 */


public class GFG {
    public static void remove(int [] a){
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();

        for( int i = 0; i < a.length; i++)
            s.add(a[i]);
            System.out.println(s);
        }
        public static void main(String[] args){

        int a [ ] = {1,2,2,3,3,4,5};
        remove(a);
    }
}
