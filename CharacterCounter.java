
public class CharacterCounter {
    public static void main(String[] args) {
        String inputStr = "Take u forward is Awesome";
        countCharacters(inputStr);
    }

    public static void countCharacters(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive counting
        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println("White spaces: " + spaceCount);
    }
}
