package leetcode;

//https://leetcode.com/problems/roman-to-integer/submissions/

import java.util.HashMap;

public class RomanInteger {
    public int romanToInt(String s) {

        int sum = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        for(int i=0; i<s.length(); i++)
        {
            if(i+1<s.length() && (s.substring(i, i+2).equals("IV") || s.substring(i, i+2).equals("IX") || s.substring(i, i+2).equals("XL") ||  s.substring(i, i+2).equals("XC") || s.substring(i, i+2).equals("CD") || s.substring(i, i+2).equals("CM")))
            {
                sum+=map.get(s.substring(i, i+2));
                i++;

            }else{
                sum+=map.get(s.charAt(i)+"");
            }

        }

        return sum;
    }

    public static void main(String arg[])
    {
        RomanInteger s = new RomanInteger();
        System.out.println(s.romanToInt("MCMXCIV"));

    }
}
