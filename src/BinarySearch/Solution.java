package BinarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        int tail =0, head =nums.length -1;
       while(tail <= head){
            int mid = tail + (head-tail)/2;
            if(target == nums[mid]) return mid;
            if(target< nums[mid])  head = mid -1;
            else tail =mid +1;
       }
       return -1;
    }
}
