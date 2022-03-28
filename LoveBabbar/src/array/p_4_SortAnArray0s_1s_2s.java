package array;

public class p_4_SortAnArray0s_1s_2s {

    //given an array 1 contains 0s, 1s, 2s sort array in ascending order
    //Dutch national flag algo

    public static void main(String[] args) {
        int N = 5;
        int [] arr = {2,2,1,0,0};

        method_1(arr, N);
    }

    private static void method_1(int[] arr, int n) {
        int low = 0, mid = 0, high = n-1 ;
        while(mid <= high ){
            if(arr[mid] == 0){
//                swap(arr[mid], arr[low]);
                swap(arr, mid, low);
                mid++;
                low++;
            }

            else if(arr[mid] == 1){
                mid++;
            }

            else{
//                swap(arr[mid], arr[high]);
                swap(arr, mid, high);
                high--;
            }
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    //swap function not working

    private static void swap(int [] a, int n1 , int n2) {
       int temp = a[n1];
       a[n1] = a[n2];
       a[n2] = temp;
    }


}
