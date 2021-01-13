import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static  Map<String,Integer> romans;

    RomanToInteger(){
        romans = new HashMap();
        romans.put("I",1);
        romans.put("V",5);
        romans.put("X",10);
        romans.put("L",50);
        romans.put("C",100);
        romans.put("D",500);
        romans.put("M",1000);
    }

    public int romanToInt(String s) {
        int sum = 0;
        if(s.isEmpty()){
            return sum;
        }
        for (Character c : s.toCharArray()){
            if(!romans.containsKey(c.toString())){
                throw new IllegalArgumentException("This is not a coorect Roman number, this character " + c + " is not part of roman literal");
            }
        }

        for (int index=0;index < s.length();index++){
            int currentValue = romans.get(Character.toString(s.charAt(index)).toUpperCase());
            //check next element if bigger
            int next = index + 1;
            if(next < s.length()){
                int nextValue = romans.get(Character.toString(s.charAt(next)).toUpperCase());
                if(nextValue>currentValue){
                    sum += nextValue - currentValue;
                    index++;
                }
                else {
                    sum += currentValue;
                }
            }
            else {
                sum += currentValue;
            }

        }


        return sum;
    }

    public static void main (String [] a){
        RomanToInteger roman = new RomanToInteger();
    System.out.println(roman.romanToInt("III"));
    }
}
