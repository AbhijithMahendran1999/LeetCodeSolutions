package MajorityElement;
import java.util.*;

public class Solution {
    // boyer-moore's algorithm
    public int majorityElement(int[] nums) {
        int candidate =0, count =0;
        for(int x :nums){
            if(count ==0) candidate =x;
            count += (x==candidate) ? 1 : -1;
        }
        return candidate;
    }
}
