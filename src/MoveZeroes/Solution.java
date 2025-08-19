package MoveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int boxlength =0;
        for(int i=0; i< nums.length; i ++){
            if(nums[i]==0)
                boxlength++;
            else
                nums[i-boxlength]= nums[i];   
        }
        for(int i=nums.length - boxlength;i<nums.length;i++)
            nums[i]=0;
    }
}
