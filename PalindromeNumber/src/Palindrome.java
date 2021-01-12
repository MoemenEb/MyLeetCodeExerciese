public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        long op=0;
        while (num!=0){
            if(op*10+(num%10) > Integer.MAX_VALUE || op*10+(num%10) < Integer.MIN_VALUE){
                op =0;
            }
            op= op*10+(num%10);
            num/=10;
        }
        if(x == (int)op){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] a){
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(1));
    }
}
