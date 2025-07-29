public class FirstAndLastPositionInSortedArray34 {
    public static void main(String[] args) {

    }
    public static int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int m;
        while(s<=e)
        {
            m=(s+e)/2;
            if(nums[m] == target)
            {
                int left=m-1;
                int right=m+1;
                while(left>=0 && nums[left]== target) left--;
                while(right<= nums.length-1 && nums[right]== target)  right++;

                return new int[] {left+1,right-1};
            }
            else if(nums[m] > target) e=m-1;
            else s=m+1;
        }

        return new int[]{-1,-1};
    }
}
