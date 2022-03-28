package array;

public class p_1_ReverseAnArray {
    //given array of string, task is to reverse array of string.
    // Input : arr[] = {1,2,3}
    //output : arr[] = {3,2,1}

    public static void main(String[] args) {
        int arr[] = {1,2,3};

        reverseArray_method1(arr);

        System.out.println("");

        reverseArray_method2(arr);
    }

    private static void reverseArray_method2(int arr[]) {

        int start = 0;
        int end = arr.length -1 ;

        reverse_method2(arr, start, end);

        for(int num: arr){
            System.out.print(num + " ");
        }

    }

    private static void reverse_method2(int[] arr, int start, int end) {

        int temp;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }


    private static void reverseArray_method1(int[] arr) {
        for(int i = arr.length -1 ; i >= 0 ; i--){
            System.out.print(arr[i] + ", ");
        }
    }

}
