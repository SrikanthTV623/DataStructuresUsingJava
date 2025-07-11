package strings.basics;

import java.util.Scanner;

public class myStringsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();

        myStrings ms = new myStrings();

        //System.out.println(ms.consecutiveIdenticalCharacters(input));

        //The quick brown fox jumps over the lazy dog
        //System.out.println(ms.containsAllCharacterAtoZ(input));

//        System.out.println(ms.insertCharactersToString(input, 2));
//        System.out.println(ms.insertCharactersToString(input, 10));

//        System.out.println("Original String: " + input);
//        System.out.println("Insert 'X' at first: " + ms.insertAtFirst(input, 'X'));
//        System.out.println("Insert 'Y' at last: " + ms.insertAtLast(input, 'Y'));
//        System.out.println("Insert 'Z' at position 3: " + ms.insertAtKthPosition(input, 'Z', 3));

//        System.out.println("Original String: " + input);
//        System.out.println("Remove at first: " + ms.removeAtFirst(input));
//        System.out.println("Remove at last: " + ms.removeAtLast(input));
//        System.out.println("Remove at specified position: " + ms.removeAtKthPosition(input, 3));

//        System.out.println(ms.findingSpecificSubString("Hello World", "llo"));

        ms.getAllSubStrings(input);
    }
}
