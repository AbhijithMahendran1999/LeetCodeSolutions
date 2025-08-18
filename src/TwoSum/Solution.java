package TwoSum;
import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapVar = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(mapVar.containsKey(nums[i]))
                return new int[]{ mapVar.get(nums[i]), i };
            mapVar.put(target -nums[i], i);
        }
        return new int[]{};
    }
}
