import java.util.*;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        int[] freq= new int[100005];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]] >=2){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
