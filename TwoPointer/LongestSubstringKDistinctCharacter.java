package TwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringKDistinctCharacter {
    public static int betterApproach(String str, int k) {
        int left = 0, right = 0, maxLen = 0, n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < n) {
            char rightChar = str.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.size() > k) {
                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                    
                }
                left++;
            }


            maxLen = Math.max(maxLen, right - left+1);
            right++;

        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str="aaabb";
        int k=3;
        System.out.println(betterApproach(str, k));
    }
}
