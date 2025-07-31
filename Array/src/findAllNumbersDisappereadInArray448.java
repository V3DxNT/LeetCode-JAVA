import java.util.ArrayList;
import java.util.List;

public class findAllNumbersDisappereadInArray448 {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] freq=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(freq[i]<1)
            {
                list.add(i);
            }
        }
        return list;

    }
}
