import java.lang.*;
import java.util.*;
public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "CAT";
        String str2 = "ACT";
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are they anagrams? " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
