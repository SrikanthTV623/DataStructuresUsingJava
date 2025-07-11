package strings.basics;

import java.util.Scanner;

//Count the Number of Words in a String

public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = input.split("\\s+"); // split by one or more spaces
            System.out.println("Number of words: " + words.length);
        }
    }
}
