public class ReverseString1 {
    public static void main(String[] args) {
        String inputStr = "Hello, World!";
        String resultStr = reverseString(inputStr);
        System.out.println("Result: " + resultStr);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
