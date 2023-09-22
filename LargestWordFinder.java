public class LargestWordFinder {
    public static void main(String[] args) {
        String inputStr = "Google Doc";
        String largestWord = findLargestWord(inputStr);
        System.out.println("Largest Word: " + largestWord);
    }

    public static String findLargestWord(String str) {
        String[] words = str.split(" ");
        String largestWord = "";

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabet characters
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}
