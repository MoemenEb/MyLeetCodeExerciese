public class ReverseInteger {

  public int reverse(int x) {
    int abs = Math.abs(x);
    int[] input = Integer.toString(abs).chars().map(c -> c - '0').toArray();
    int[] output = new int[input.length];
    for (int loop = 0; loop < input.length; loop++) {
      output[loop] = input[input.length - 1 - loop];
    }
    int op = 0;
    for (int n : output) {
      op = 10 * op + n;
    }
    if (x < 0) {
      return op * -1;
    }
    return op;
  }

  public int newReverse(int x){
      long op=0;
      while (x!=0){
          if(op*10+(x%10) > Integer.MAX_VALUE || op*10+(x%10) < Integer.MIN_VALUE){
              return 0;
          }
          op= op*10+(x%10);
          x/=10;
      }
      return (int)op;
  }

  public static void main(String[] ar) {

    ReverseInteger r = new ReverseInteger();
    //    System.out.println(r.reverse(-0));
        System.out.println(r.newReverse(1534236469));
  }
}
