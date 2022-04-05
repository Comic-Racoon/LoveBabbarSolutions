package array;

public class p_11_FindDuplicateumber {
    /*287. Find the Duplicate Number

    Given an array of integers nums containing n + 1 integers
    where each integer is in the range [1, n] inclusive.
    There is only one repeated number in nums, return this repeated number.
    You must solve the problem without modifying the array nums and uses only
         constant extra space.
    Example 1:
    Input: nums = [1,3,4,2,2]
    Output: 2
    Example 2:
    Input: nums = [3,1,3,4,2]
    Output: 3
    */
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        int slow = nums[0];
        int fast = nums[0];

        do{
            //it moves slow pointer by 1
            slow = nums[slow];
            //moves fast pointer by 2 nuns[nuns[
            fast = nums[nums[fast]];
        }while (slow != fast);

        fast = nums[0];
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        System.out.println(slow);
    }
}
