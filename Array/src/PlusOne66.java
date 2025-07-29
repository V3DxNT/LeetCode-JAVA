import java.util.Arrays;

public class PlusOne66 {

    public static void main(String[] args) {
        int[] check={9};
        System.out.println(Arrays.toString(plusOne(check)));

    }


    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        int[] digitNew=new int[len+1];
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]+=1;
                break;
            }

            if(allNine(digits))
            {

                for(int j=0;j<=digitNew.length-1;j++){
                    if(j==0){
                        digitNew[j]=1;

                    }else{
                        digitNew[j]=0;
                    }

                }

            }
            else if(digits[i]==9){
                digits[i]=0;

            }
        }
        if(allNine(digits)){
            return digitNew;
        }else{

            return digits;
        }



    }
    public static boolean allNine(int[] digits){
        boolean answer=true;
        for(int digit : digits)
        {
            if(digit != 9)
            {
                answer=false;
                break;
            }
        }
        return answer;
    }
}
