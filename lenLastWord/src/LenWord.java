public class LenWord {

    public int lengthOfLastWord(String s) {
        if (s.length() == 0 || s.isEmpty()) return 0;

        String [] str = s.split(" ");
        if (str.length>0) return str[str.length-1].length();
        else return 0;
    }

//    public int lengthOfLastWord2(String s) {
//        int length = 0;
//
//        // We are looking for the last word so let's go backward
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) != ' ') { // a letter is found so count
//                length++;
//            } else {  // it's a white space instead
//                //  Did we already started to count a word ? Yes so we found the last word
//                if (length > 0) return length;
//            }
//        }
//        return length;
//    }


//    public int lengthOfLastWord3(String s)
//    {
//        s=s.trim();
//        return ((s.substring(s.lastIndexOf(" ")+1)).length());
//
//    }

    public static void main (String a []){
        LenWord lenWord = new LenWord();
    System.out.println(lenWord.lengthOfLastWord(" "));
    }
}
