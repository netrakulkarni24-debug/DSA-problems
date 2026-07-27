import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            HashSet<Character> set1 = new HashSet<>();

            // Store distinct characters of words[i]
            for (int k = 0; k < words[i].length(); k++) {
                set1.add(words[i].charAt(k));
            }

            for (int j = i + 1; j < words.length; j++) {
                HashSet<Character> set2 = new HashSet<>();

                // Store distinct characters of words[j]
                for (int k = 0; k < words[j].length(); k++) {
                    set2.add(words[j].charAt(k));
                }

                // Compare the two sets
                if (set1.equals(set2)) {
                    count++;
                }
            }
        }

        return count;
    }
}