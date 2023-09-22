import java.lang.*;
import java.util.*;

public class CapitalizeWords {
    public static void main(String[] args) {
        String inputStr = "take u forward is awesome";
        String resultStr = capitalizeWords(inputStr);
        System.out.println("Result: " + resultStr);
    }

    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char[] wordChars = word.toCharArray();
                wordChars[0] = Character.toUpperCase(wordChars[0]);
                wordChars[wordChars.length - 1] = Character.toUpperCase(wordChars[wordChars.length - 1]);
                result.append(wordChars).append(" ");
            }
        }