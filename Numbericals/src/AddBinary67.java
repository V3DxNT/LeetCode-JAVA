public class AddBinary67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String addBinary(String a, String b) {
        int x=Integer.parseInt( a, 2);
        int y=Integer.parseInt( b,2);
        int add=x+y;
        String result=Integer.toBinaryString(add);
        return result;
    }
}
