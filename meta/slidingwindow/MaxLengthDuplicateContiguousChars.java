package meta.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class MaxLengthDuplicateContiguousChars {
    public static List<Character> maxLengthDuplicateContiguousChars(String s) {
        int maxCount = 0;
        List<Character> maxChars = new ArrayList<>();

        char currentChar = '\0'; // initialize with a placeholder character
        int currentCount = 0;

        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChars.clear();
                    maxChars.add(currentChar);
                } else if (currentCount == maxCount) {
                    maxChars.add(currentChar);
                }
                currentChar = c;
                currentCount = 1;
            }
        }

        // Check if the last sequence is the longest
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxChars.clear();
            maxChars.add(currentChar);
        } else if (currentCount == maxCount) {
            maxChars.add(currentChar);
        }

        return maxChars;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthDuplicateContiguousChars("aaaabbbbccc")); // Output: [a, b]
        System.out.println(maxLengthDuplicateContiguousChars("abcd"));        // Output: [a, b, c, d]
    }
}
