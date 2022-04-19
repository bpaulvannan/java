package bpv.corejava.string;

public class RotatedStrings {
    public static boolean isRotated(String str, String rotated){
        return str.length() == rotated.length() && (str + str).indexOf(rotated) != -1;
    }
}
