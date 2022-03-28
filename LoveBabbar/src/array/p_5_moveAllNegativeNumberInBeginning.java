package array;

public class p_5_moveAllNegativeNumberInBeginning {
//    Move all negative numbers to beginning and positive
//    to end with constant extra space

//Examples :
//
//Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5

    public static void main(String[] args) {

        int a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = a.length;

        method1(a, n);

        //dutch national flag

        // two pointer


    }

    private static void method1(int[] a, int n) {
        //
        // By implementing Qucik Sort
        //
        int j =0 , temp;

        for(int i =0; i< n; i++){
            if(a[i] < 0){
                if( i != j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for (int i : a){
            System.out.print(i+ " ");
        }

    }


}
