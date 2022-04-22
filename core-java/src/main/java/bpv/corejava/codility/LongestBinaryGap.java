package bpv.corejava.codility;

public class LongestBinaryGap {
    public static int find(int n){
        int longestBinaryGap = 0;
        if (n > 0) {
            String binary = Integer.toBinaryString(n);
            binary = binary.substring(0,binary.lastIndexOf("1"));

            for(String part : binary.split("1")){
                if(part.length() > longestBinaryGap ){
                    longestBinaryGap = part.length();
                }
            }
        }
        return longestBinaryGap;
    }
}
