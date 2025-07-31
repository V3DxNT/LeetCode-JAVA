public class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=(n*(n+1))/2;
        int missing=-1;
        int arraySum=0;
        for(int i=0;i<n;i++)
        {
            arraySum+=nums[i];
        }
        return (totalSum-arraySum);
    }
}
