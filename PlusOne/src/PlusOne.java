public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length-1 ; i >=0; i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
            }
            else
                digits[i] = 0;
        }
        if (digits[0] == 0){
            int [] newDig = new int[digits.length+1];
            newDig[0] = 1;
            return newDig;
        }
        return digits;
    }

    public int[] plusOneNoBreak(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i>= 0; i--) {
            digits[i] += carry;
            if (digits[i] <= 9) // early return
                return digits;
            digits[i] = 0;
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}
