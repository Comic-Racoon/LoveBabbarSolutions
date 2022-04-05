package array;

import java.util.Arrays;

import static java.lang.Math.abs;

public class p_9_MinimizeTheHeight {
    /*
    Given an array arr[] denoting heights of N towers and a positive integer K,
    you have to modify the height of each tower either by increasing or decreasing
    them by K only once. After modifying, height should be a non-negative integer.

    Find out the minimum possible difference of the height of shortest and longest
    towers after you have modified each tower.

    You can find a slight modification of the problem here.
    Note: It is compulsory to increase or decrease (if possible) by K to each tower.

    Example 1:

    Input:
    K = 2, N = 4
    Arr[] = {1, 5, 8, 10}
    Output:
    5
    Explanation:
    The array can be modified as
    {3, 3, 6, 8}. The difference between
    the largest and the smallest is 8-3 = 5.
    */
    public static void main(String[] args) {


        // k is given dont idiot
        int [] a = {3, 9, 12, 16, 20};

        int n = a.length;
        minDifference_method1(a, n);

    }

    private static void minDifference_method1(int[] a, int n) {

        Arrays.sort(a);

        int diff =  a[n-1] - a[n-2];

        for(int i =0 ; i< n; i++){
            if (a[i] < diff){
                a[i] = a[i]+diff;
            }
            else{
                a[i] = a[i] - diff;
            }
        }

        Arrays.sort(a);

        System.out.println(abs(a[0] - a[n-1]));

    }

}
