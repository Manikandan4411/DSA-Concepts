public class StringOperations {

    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. Find length
        System.out.println("Length: " + str.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Extract substring
        System.out.println("Substring: " + str.substring(0, 5));

        // 5. Compare strings
        System.out.println("Equals: " + str.equals("Hello Java"));

        // 6. Check contains
        System.out.println("Contains Java: " + str.contains("Java"));

        // 7. Replace characters
        System.out.println("Replace: " + str.replace("Java", "World"));

        // 8. Reverse string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // 9. Count vowels
        int vowels = 0;
        String text = str.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            }
        }

        System.out.println("Vowel Count: " + vowels);

        // 10. Check palindrome
        String word = "madam";
        String reverseWord =
                new StringBuilder(word).reverse().toString();

        System.out.println("Is Palindrome: "
                + word.equals(reverseWord));
    }
}
