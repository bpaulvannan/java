package bpv.corejava.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Find if two strings are anagrams
 *
 * Example: Garden, Danger
 */
public class Anagrams {

    public static boolean isAnagramUsingSort(String s1, String s2){
        if(s1 != null && s2 != null){
            if(s1.length() == s2.length()){
                if(s1.equalsIgnoreCase(s2)){
                    return true;
                }
                char[] ch1 = s1.toUpperCase().toCharArray();
                char[] ch2 = s1.toUpperCase().toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                return Arrays.equals(ch1,ch2);
            }
        }
        return false;
    }

    public static boolean isAnagramUsingCounter(String s1, String s2){
        if(s1 != null && s2 != null){
            if(s1.length() == s2.length()){
                if(s1.equalsIgnoreCase(s2)){
                    return true;
                }
                int[] chArr1 = new int[26];
                int[] chArr2 = new int[26];
                for(int i=0;i<s1.length();i++){
                    int ch1 = ((int)s1.toUpperCase().charAt(i))%65;
                    chArr1[ch1] = chArr1[ch1] + 1;
                    int ch2 =  ((int)s2.toUpperCase().charAt(i))%65;
                    chArr2[ch2] = chArr2[ch2] + 1;
                }
                return Arrays.equals(chArr1,chArr2);
            }
        }
        return false;
    }
}
