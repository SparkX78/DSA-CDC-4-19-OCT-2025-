import java.util.*;

public class DSA_18 {
    public static char solve(String s) {
        // Frequency map to count characters
        HashMap<Character, Integer> map = new HashMap<>();
        char maxChar = ' ';
        int maxFreq = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') continue; // Skip spaces
            ch = Character.toUpperCase(ch); // Normalize case

            int freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = ch;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String s = "ENCYCLOPEDIA IS GREAT BOOK";
        System.out.println("Most frequent character: " + solve(s));
    }
}
