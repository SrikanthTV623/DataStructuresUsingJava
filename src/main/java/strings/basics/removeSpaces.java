package strings.basics;

import java.util.Scanner;

//Remove Leading, Trailing, and Extra Spaces in a String

public class removeSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();

        // Step 1: trim leading and trailing spaces
        String trimmed = input.trim();

        // Step 2: replace multiple spaces with a single space
        String cleaned = trimmed.replaceAll("\\s+", " ");

        System.out.println("Cleaned string: " + cleaned);
    }
}
