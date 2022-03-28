package array;

public class p_2_MinAndMax_usingMinimumNoOfComparison {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        method1(arr);
    }

    private static void method1(int[] arr) {
        int max= arr[0];
        int min = arr[0];

        if(arr.length == 1 ){
            // edge case
            System.out.println("Max int is: " + max );
            System.out.println("Min int is: " + min );
            return;
        }



        for(int i =0; i < arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Max int is: " + max );
        System.out.println("Min int is: " + min );

    }
}
