import java.util.*;

public class IntersectionTwoArrays349 {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<>();
        int n1=nums1.length;
        int n2=nums2.length;

        int[] ans=new int[Math.min(n1,n2)];

        for(int i=0;i<nums1.length;i++)
        {
            map.add(nums1[i]);
        }
        int k=0;
        for(int i=0;i<nums2.length;i++)
        {

            if(map.contains(nums2[i]))
            {
                ans[k++]=nums2[i];
                map.remove(nums2[i]);
            }
        }
        return Arrays.copyOf(ans, k);
    }
}
