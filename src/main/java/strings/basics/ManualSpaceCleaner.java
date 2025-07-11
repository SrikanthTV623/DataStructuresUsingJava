package strings.basics;

import java.util.Scanner;

public class ManualSpaceCleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = input.length();

        // Step 1: Skip leading spaces
        while (i < n && input.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Process words and reduce multiple spaces between words
        boolean inWord = false;
        while (i < n) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result.append(ch);
                inWord = true;
            } else if (inWord) {
                // Add single space between words
                result.append(' ');
                inWord = false;
            }
            i++;
        }

        // Step 3: Remove trailing space if present
        int len = result.length();
        if (len > 0 && result.charAt(len - 1) == ' ') {
            result.deleteCharAt(len - 1);
        }

        System.out.println("Cleaned string: " + result.toString());
    }
}
