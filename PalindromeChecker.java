public class PalindromeChecker {
    public static void main(String[] args) {
        String inputStr = "ABCDCBA";
        boolean result = isPalindrome(inputStr);
        
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "").toLowerCase(); // Remove spaces and convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
