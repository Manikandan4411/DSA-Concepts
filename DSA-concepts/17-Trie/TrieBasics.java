public class TrieBasics {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    static TrieNode root = new TrieNode();

    static void insert(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEnd = true;
    }

    static boolean search(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return current.isEnd;
    }

    public static void main(String[] args) {
        insert("cat");
        insert("car");

        System.out.println(search("cat")); // true
        System.out.println(search("car")); // true
        System.out.println(search("dog")); // false
    }
}