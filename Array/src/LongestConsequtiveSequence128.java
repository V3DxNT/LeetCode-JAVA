import java.util.*;

public class LongestConsequtiveSequence128 {

        public int longestConsecutive(int[] nums) {
            if(nums.length ==0) return 0;

            HashSet<Integer> list= new HashSet<>();
            for(int i =0;i<nums.length;i++){
                list.add(nums[i]);
            }

            int cCount=1;
            int largest=1;

            int seqStart;
            for(int i:list){

                if(!list.contains(i-1)){
                    cCount=1;
                    seqStart=i;
                    while(list.contains(seqStart+1)){
                        cCount++;
                        seqStart++;
                    }
                    largest=Math.max(largest,cCount);
                }
            }
            return largest;
        }

}
