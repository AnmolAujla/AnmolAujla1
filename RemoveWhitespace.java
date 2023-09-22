public class RemoveWhitespace {
    public static void main(String[] args) {
        String inputStr = "Take you forward";
        String resultStr = removeWhitespace(inputStr);
        System.out.println("Result: " + resultStr);
    }

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }
}
