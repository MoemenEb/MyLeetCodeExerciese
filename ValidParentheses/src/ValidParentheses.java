import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() < 1 || s.length() > 10000){
            throw new IllegalArgumentException("String length must be between 1 and 10,000");
        }
        if(s.matches(".*[a-zA-Z0-9].*")){
            throw new IllegalArgumentException("String can only has ( ) { } [ ]");
        }
        List<Character> open  = new ArrayList<Character>(){{
            add('(');
            add('[');
            add('{');
        }};
        List<Character> close = new ArrayList<Character>(){{
         add(')');
         add(']');
         add('}');
        }};
        List<Character> que = new ArrayList<>();
        int currentIndex=0;

        for (char c : s.toCharArray()){

            if (open.contains(c)){
                que.add(c);
                currentIndex = open.indexOf(c);
            }

            if(close.contains(c)){
                if (que.isEmpty()){
                    return false;
                }
                if (currentIndex == close.indexOf(c)){
                    que.remove(que.size()-1);
                    currentIndex = que.size()==0? 0 : open.indexOf(que.get(que.size()-1));
                }
                else {
                    return false;
                }
            }

        }

        if(que.isEmpty()){
            return true;
        }
        return false;
    }


    public static void main (String [] ar){
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("){"));
    }
}
