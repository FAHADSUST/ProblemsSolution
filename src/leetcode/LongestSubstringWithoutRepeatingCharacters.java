package leetcode;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int startWind = 0, endWind = 0;
        int max = 0;
        int count = 0;
        int[] map = new int[200];

        for(endWind = 0; endWind<s.length(); endWind++)
        {
            int index = s.charAt(endWind) - ' ';
            map[index]++;

            count++;
            //System.out.println(s.charAt(endWind)+"+");
            while(map[index]>1 && startWind<endWind){
                int index1 = s.charAt(startWind) - ' ';
                map[index1]--;
                startWind++;
                count--;

            }

            max = Math.max(max, count);
        }

        return max;
    }
}
