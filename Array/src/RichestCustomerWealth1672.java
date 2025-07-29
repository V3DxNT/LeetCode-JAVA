public class RichestCustomerWealth1672 {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
}
