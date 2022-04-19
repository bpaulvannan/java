package bpv.corejava.string;

import java.util.HashSet;
import java.util.Set;

public class RepeatingChars {
    public static Set<Character> find(String str){
        Set<Character> repeatingChars = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(repeatingChars.contains(ch)) continue;
            if(str.indexOf(ch) != str.lastIndexOf(ch)){
                repeatingChars.add(ch);
            }
        }
        return repeatingChars;
    }
}
