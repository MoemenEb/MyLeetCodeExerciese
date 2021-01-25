public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length>200){
            throw new IllegalArgumentException("Max strings to compare is 200");
        }
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        StringBuilder common = new StringBuilder();


        for (int index=0; index<strs[0].length() && index<strs[1].length(); index++){
            if(strs[0].length() > 200 || strs[1].length() > 200){
                throw new IllegalArgumentException("String value exceeds 200 for either first or second element or both, max string length is 200");
            }
            if(strs[1].charAt(index) == strs[0].charAt(index)){
                common.append(strs[0].charAt(index));
            }
            else {
                break;
            }
//            if(common.toString().isEmpty()){
//                return common.toString();
//            }
        }

        for (int index=2;index<strs.length;index++){
            if(strs[index].isEmpty()){return "";}
            if(strs[index].length()>200){
                throw new IllegalArgumentException("String value at "+index+1+" exceeds 200, max string length is 200");
            }
            while (! strs[index].startsWith(common.toString()) && !(common.length()==0) ){
                common = common.deleteCharAt(common.length()-1);
            }
        }
        return common.toString();
    }


    public static void main(String [] ar){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String [] array = new String[]{"cir","abc"};
        System.out.println(lcp.longestCommonPrefix(array));
    }
}
