import java.util.Arrays;

public class FlippingImage832 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] each: image){
            horizontalFlip(each);
            invert(each);
        }
        return image;


    }

    public static int[] horizontalFlip(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int[] invert(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            {
                arr[i]=1;
            }else
            {
                arr[i]=0;
            }
        }
        return arr;
    }
}
