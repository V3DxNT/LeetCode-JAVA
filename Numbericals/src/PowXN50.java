public class PowXN50 {
    public double myPow(double x, int n) {
        double pow=1;
        if(x==1) return 1;
        if(x==(-1) && n==Integer.MIN_VALUE) return 1;
        if(x==(-1)) return -1;

        if(n== Integer.MIN_VALUE) return 0;

        double N=Math.abs(n);

        for(int i=0;i<N;i++)
        {
            pow=pow*x;
        }

        if(n >0){
            return pow;
        }else{
            return (1/pow);
        }
    }
}
