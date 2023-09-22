public class RemoveNonAlphabets {
    public static void main(String[] args) {
        String inputStr = "take12% *&u ^$#forward";
        String resultStr = removeNonAlphabets(inputStr);
        System.out.println("Result: " + resultStr);
    }

    public static String removeNonAlphabets(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }
}
