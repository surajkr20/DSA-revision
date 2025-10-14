package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode - https://leetcode.com/problems/valid-anagram/description/

public class Anagram {
    // brute force approach
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(t_arr);

        int i = 0;
        int j = 0;
        while (i < s_arr.length && j < t_arr.length) {
            if (s_arr[i] != t_arr[j])
                return false;
            i++;
            j++;
        }
        return true;
    }

    // better approach - hashmap >> o(n + m) time and o(1) space
    static boolean isAnagram02(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for(Map.Entry<Character, Integer> pair : map.entrySet()){
            if(pair.getValue() != 0) return false;
        }

        return true;
    }

    // better approach - 2 >> using frequency array
    static boolean isAnagram03(String s, String t){
        if(s.length() != t.length()) return false;
        char[] freq = new char[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freq[ch - 'a']--;
        }

        for(int count: freq){
            if(count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println(isAnagram(s1, s2));
    }
}
