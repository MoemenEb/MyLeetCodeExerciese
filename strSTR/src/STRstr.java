public class STRstr {

    public int strStr(String haystack, String needle) {

        if(needle.length()==0){
            return 0;
        }
        if(haystack.length()==0 && needle.length()!=0){
            return -1;
        }

        for(int ind=0; ind<haystack.length(); ind++){
            int count=0;
            if(haystack.charAt(ind) == needle.charAt(0)){
                for (int len=ind,ned=0; len < haystack.length() && ned<needle.length();len++,ned++){
                    if(haystack.charAt(len) != needle.charAt(ned)){
                        break;
                    }
                    count++;
                }
                if (count == needle.length()){
                    return ind;
                }
            }
        }

        return -1;
    }

    public int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public static void main (String [] a){
        STRstr s = new STRstr();
        System.out.println(s.strStr2("heloll","ll"));
    }

}
