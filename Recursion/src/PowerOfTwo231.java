public class PowerOfTwo231 {
    public boolean isPowerOfTwo(int n) {

        return helper(n,0);
    }

    static boolean helper(int n,int expo){
        if(n < Math.pow(2,expo)) return false;

        if(n == Math.pow(2,expo)) return  true;

        return helper(n,expo+1);
    }
}
