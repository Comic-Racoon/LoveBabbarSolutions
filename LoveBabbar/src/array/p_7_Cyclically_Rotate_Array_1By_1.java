package array;

import java.util.Arrays;
import java.util.List;

public class p_7_Cyclically_Rotate_Array_1By_1 {

    /*Given an array, rotate the array by one position in clock-wise direction.


    Example 1:

    Input:
    N = 5
    A[] = {1, 2, 3, 4, 5}
    Output:
    5 1 2 3 4
    Example 2:
    Input:
    N = 8
    A[] = {9, 8, 7, 6, 4, 2, 1, 3}
    Output:
    3 9 8 7 6 4 2 1

*/

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        rotate_method1(a);
        rotate_method2(a);
    }

    private static void rotate_method2(int[] a) {
        int [] res = new int[a.length];

        for(int i =0; i< a.length; i++){
            res[(i+1)% (a.length-1)] = a[i];
        }
        System.out.println();
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));
    }

    private static void rotate_method1(int[] a) {

      int temp = a[a.length -1];

      for(int i = a.length-1; i>0; i--){
          a[i] = a[i-1];
      }
      a[0] = temp;

        Arrays.stream(a).forEach(i -> System.out.print(i + " "));
    }
}
