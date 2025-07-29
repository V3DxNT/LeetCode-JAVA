public class EvenDIgit1295 {
    public static void main(String[] args) {

    }
    public int findNumbers(int[] nums) {
        //int[] nums={12,345,2,6,-7896,669,787922};
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            // while(Math.abs(n)>0)
            // {
            //     c+=1;
            //     n=(int)n/10;
            // }
            int c=(int)Math.log10(n)+1;
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}
