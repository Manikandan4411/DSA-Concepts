public class StringBasics {

    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. Print a string
        System.out.println("String: " + str);

        // 2. Find string length
        System.out.println("Length: " + str.length());

        // 3. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. Access a character
        System.out.println("First Character: " + str.charAt(0));

        // 6. Extract a substring
        System.out.println("Substring: " + str.substring(0, 5));

        // 7. Reverse a string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // 8. Check palindrome
        String word = "madam";
        String reverseWord = new StringBuilder(word).reverse().toString();

        System.out.println("Is Palindrome: " + word.equals(reverseWord));

        // 9. Compare strings
        System.out.println("Strings Equal: " + str.equals("Hello Java"));

        // 10. Check if string contains text
        System.out.println("Contains Java: " + str.contains("Java"));
    }
}