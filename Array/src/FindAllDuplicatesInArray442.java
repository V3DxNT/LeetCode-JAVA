import java.util.*;

public class FindAllDuplicatesInArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        int[] freq= new int[100005];
        for (int num : nums) {
            freq[num]++;
            if (freq[num] >= 2) {
                ans.add(num);
            }
        }
        return ans;
    }
}
