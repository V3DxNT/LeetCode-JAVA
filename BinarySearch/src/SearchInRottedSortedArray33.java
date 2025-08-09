
public class SearchInRottedSortedArray33 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }

    static int helper(int[] arr,int target,int s,int e){
        if(s>e) return -1;
        int m=s+(e-s)/2;
        if(arr[m]== target) return m ;

        if(arr[s] <= arr[m])
        {
            if(target>=arr [s] && target<=arr[m])
            {
                return helper(arr,target,s,m-1);
            }
            else return helper(arr,target,m+1,e);
        }

        if(target >= arr[m] && target<=arr[e])
        {
            return helper(arr,target,m+1,e);
        }
        else  return helper(arr,target,s,m-1);
    }
}
