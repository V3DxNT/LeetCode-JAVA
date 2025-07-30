public class SearchInsertPosition35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2,3,4},5));
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int high=nums.length-1;
        while(start<=high){
            int mid=(int)(start+high)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target) high=mid-1;

            else start=mid+1;

        }
        if(nums[nums.length-1] > target ) return high+1;
        else return start;

    }
}
