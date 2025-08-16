public class Maximum69Number1323 {
    public int maximum69Number (int num) {
        // Convert to String, then to int[]
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int

        }
        int count=0; // To change only one element
        for(int i = 0; i < digits.length; i++){
            if(digits[i]==6 && count!=1){
                digits[i]=9;
                count++;
            }

        }
        int number=0;
        for (int digit : digits) {       // To convert Array into Number
            number = number * 10 + digit;
        }
        return number;

    }
}
