public class BinarySearch704 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int m=(int)(s+e)/2;
            if(nums[m]== target) {
                return m;
            }
            else if(nums[m]>target) e=m-1;
            else s=m+1;
        }
        return -1;


    }
}
