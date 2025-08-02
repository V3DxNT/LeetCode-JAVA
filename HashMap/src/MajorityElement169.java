import java.util.*;
public class MajorityElement169 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int major=n/2;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i])>major)
            {
                return nums[i];
            }
        }
        return -1;

    }
}
