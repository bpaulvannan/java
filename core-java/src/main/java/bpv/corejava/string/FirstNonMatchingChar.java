package bpv.corejava.string;


/**
 * Scan the string char by char
 * if first index and last index of the char are equal, then its not repeating
 */
public class FirstNonMatchingChar {
    public static Character find(String str){
        for(int i = 0;i<str.length();i++){
            char curChar = str.charAt(i);
            if(str.indexOf(curChar) == str.lastIndexOf(curChar)) return curChar;
        }
        return null;
    }
}
