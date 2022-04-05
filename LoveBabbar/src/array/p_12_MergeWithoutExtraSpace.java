package array;

public class p_12_MergeWithoutExtraSpace {
    /*Given two sorted arrays arr1[] of size N and arr2[] of size M.
    Each array is sorted in non-decreasing order. Merge the two arrays
    into one sorted array in non-decreasing order without using any extra space.

    Example 1:

    Input:
    N = 4, M = 5
    arr1[] = {1, 3, 5, 7}
    arr2[] = {0, 2, 6, 8, 9}
    Output: 0 1 2 3 5 6 7 8 9
    Explanation: Since you can't use any
    extra space, modify the given arrays
    to form
    arr1[] = {0, 1, 2, 3}
    arr2[] = {5, 6, 7, 8, 9}
*/

    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7};
        int [] arr2 = {0,2,6,8,9};

        int n = arr1.length;
        int m = arr2.length;

        //using gap ->
        int t_len = n + m;
        int gap = (n+m)/2;
        while(gap>0)
        {
            int i = 0;
            int j = gap;
            int a1[], a2[];
            while(j<t_len)
            {

                int sub1, sub2;
                if(i<n)
                {
                    a1 = arr1;
                    sub1 = 0;
                }
                else
                {
                    a1 = arr2;
                    sub1 = n;
                }

                if(j<n)
                {
                    a2 = arr1;
                    sub2 = 0;
                }
                else
                {
                    a2 = arr2;
                    sub2 = n;
                }

                if(a1[i-sub1]>a2[j-sub2])
                {
                    int temp = a1[i-sub1];
                    a1[i-sub1] = a2[j-sub2];
                    a2[j-sub2] = temp;
                }

                i++;
                j++;

            }

            if(gap!= 1) gap = (gap + 1)/2;
            else gap = 0;

        }

    }

}
