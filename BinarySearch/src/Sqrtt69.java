public class Sqrtt69 {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        int s=0;
        int e=x;
        if(x<=1) return x;
        while(s<=e)
        {
            int mid=(int) (s+e)/2;
            long sq=(long)mid*mid;
            if(sq == x) return mid;

            else if(sq>x) e=mid-1;
            else s=mid+1;
        }
        return e;

    }
}
