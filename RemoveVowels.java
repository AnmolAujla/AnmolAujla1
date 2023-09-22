public class RemoveVowels {
    public static void main(String[] args) {
        String inputStr = "take u forward";
        String resultStr = removeVowels(inputStr);
        System.out.println("Result: " + resultStr);
    }

    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
