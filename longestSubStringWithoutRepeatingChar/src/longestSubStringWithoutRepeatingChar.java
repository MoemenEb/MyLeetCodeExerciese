import java.util.*;

public class longestSubStringWithoutRepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int startIndex = 0;
        String test = s.substring(startIndex, 1);
        Map<String, Integer> stringSize = new LinkedHashMap<>();
        for (int loop = 1; loop < s.length(); loop++) {
            if (test.indexOf(s.charAt(loop)) == -1) {                         //doesn't exist
                test = s.substring(startIndex, loop+1);
            }
            else {
                stringSize.put(test, test.length());
                startIndex ++;
                loop = startIndex;
                test = s.substring(startIndex,loop+1);
            }
        }
        stringSize.put(test, test.length());
        List<Integer> size = new ArrayList<>(stringSize.values());
        Collections.sort(size);

        return size.get(size.size()-1);
    }

    public int lengthOfLongestSubstringUsingMap(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstringUsingSets(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    

    public static void main(String[] ar){
        longestSubStringWithoutRepeatingChar l = new longestSubStringWithoutRepeatingChar();
        System.out.println(l.lengthOfLongestSubstring("pwwkew"));
    }
}
