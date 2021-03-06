package array;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class p_6_UnionOfTwoArrays {

    //Given two arrays a[] and b[] of size n and m respectively.
    // The task is to find union between these two arrays.
    //
    //Union of the two arrays can be defined as the set containing
    // distinct elements from both the arrays. If there are repetitions,
    // then only one occurrence of element should be printed in the union.

    /*
    * Example 1:

    Input:
    5 3
    1 2 3 4 5
    1 2 3
    Output:
    5
    Explanation:
    1, 2, 3, 4 and 5 are the
    elements which comes in the union set
    of both arrays. So count is 5.
    *
    * */
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3};

        Set s = new HashSet<>(Collections.singleton(a));
        for(int i : a){
            s.add(i);
        }

        for(int i : b){
            s.add(b);
        }

        System.out.println(s.size());
    }
}
