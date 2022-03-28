package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

public class p_3_kthSmallestElement {
    //https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
    //using priority queue

    // given array[] and k where k is the smaller than size of array, the task is to find the kth smallest element
    // in the given array. it is given that all array elements are distinct

    public static void main(String[] args) {

        int [] arr= {6,29,905,73,68,23,55};
        int k = 4;

        method1(arr, k);
        System.out.println(" ");
        method2(arr, k);
    }

    private static void method2(int[] arr, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int i =0; i< k ; i++){
            queue.add(arr[i]);
        }

        for (int i = k ; i< arr.length ; i++){
            if(queue.peek() < arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }

        System.out.println(queue.peek());

    }

    private static void method1(int[] arr, int k) {
        //sort array and print
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
