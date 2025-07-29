public class ValidPerfectSquare367 {
    public static void main(String[] args) {

    }
    public boolean isPerfectSquare(int num) {
        int s = 0;
        int e = num/2;
        //int m;
        if (num<=1) return true;

        while(s<=e) {
            int m = s+(e-s) / 2;
            long sq=(long)m*m;
            if (sq== num)
            {
                return true;
            }
            else if(sq <num)
                s=m+1;
            else e=m-1;

        }
        return false;

    }
}
