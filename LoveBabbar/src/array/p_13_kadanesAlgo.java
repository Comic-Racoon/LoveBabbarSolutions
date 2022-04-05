package array;

public class p_13_kadanesAlgo {
    /*
    Given an array Arr[] of N integers. Find the contiguous
    sub-array(containing at least one number) which has the maximum sum and return its sum.

    Example 1:

    Input:
    N = 5
    Arr[] = {1,2,3,-2,5}
    Output:
    9
    Explanation:
    Max subarray sum is 9
    of elements (1, 2, 3, -2, 5) which
    is a contiguous subarray.
    */

    public static void main(String[] args) {
        int [] a = {1,2,3,-2,5};
        int n = a.length;

        max_sum_subArray(a,n);
    }

    private static void max_sum_subArray(int[] a, int n) {
        int maxsum =0;
        int currentSum = 0;

        for(int i =0; i< n ; i++){
            currentSum = currentSum + a[i];

            if(currentSum > maxsum){
                maxsum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println(maxsum);

    }
}
