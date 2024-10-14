package TwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int longestSubstring(String str){
        int n=str.length();
        int maxLen=0;
        HashMap<Character, Integer> hash= new HashMap<>();

        int left=0, right=0;

        while(right<n){
            char ch= str.charAt(right);

            if(hash.containsKey(ch)){
                int indx= hash.get(ch);
                if(indx>=left) left=indx+1;
                hash.replace(ch,indx, right);
            }else{
                hash.put(ch,right);
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;

    }
    public static void main(String[] args) {
        String str="abcb";
        System.out.println(longestSubstring(str));
    }
}
